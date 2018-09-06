package MyPet;

import java.util.Random;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		PetAfficheur.printStart();
		String nom;
		System.out.print("         Comment voulez-vous appeler votre Pet ?");
		Scanner sc = new Scanner(System.in);
		nom = sc.nextLine();
		Partie partie = new Partie(nom);
		Personnage perso = partie.getPet();
		Evenements e = new Evenements(perso);
        System.out.println(perso.messageInit());
        int tempo = 0;
		while(!perso.estMort()) {
			System.out.println("\n");
			System.out.println("\n");
			perso = partie.getPet();
			tempo = perso.getTempo();
			if(!perso.estMort()) {
				if(perso.estAffame()) {
					perso.perteSante();
					System.out.println("J'ai faim, je vais finir par tomber malade !");
				}
					
				if(perso.estTriste()) {
					perso.perteEnergie();
					System.out.println("Je suis trop triste, ça me fatigue !");
				}
				
				PetAfficheur.printPersonnage(perso);
				
				int choix  = partie.lireInstruction();
				switch(choix) {
					case 1:
						if(perso.getCaract() == Caractere.Rassasie && hasard()) {
							System.out.println("Il ne veut pas de nourriture.");
						}else {
							tempo += perso.mangerBoire();
							if(e.seProduit()) {
							e.estMalade();
							}
						}
						break;
					case 2:
						if(perso.getCaract() == Caractere.Joyeux && hasard()) {
							System.out.println("Il n'est pas d'humeur à dormir, il veut s'amuser.");
						}else {
							tempo += perso.dormir();
							if(e.seProduit()) {
								e.peurDuNoir();
							}
						}
						break;
					case 3:
						tempo += perso.soigner();
						if(e.seProduit()) {
							e.seSentTriste();
						}
						break;
					case 4:
						tempo += perso.caresser();
						break;
					case 5:
						if(perso.getCaract() == Caractere.Feneant && hasard()) {
							System.out.println("Il n'est pas d'humeur à jouer.");
						}else {
							tempo += perso.jouer();
						}
						break;
					case 6:
						tempo += perso.laver();
						break;
					default:
						System.out.println("Instruction incorrecte.");
					}
				perso.effetCaractere(perso);
				perso.verifiePalier();
				perso.setTempo(tempo);
				
				if(partie.testJourneeEcoulee());
				
				System.out.println("Jour numéro " + partie.getCompteurJours());
				
				partie.evolution();
			}
		}
		
		PetAfficheur.printDead();
		System.out.println("Votre Pet a survecu"+ partie.getCompteurJours()+ " jours,le pauvre.");
	}

	public static boolean hasard() {
		Random random = new Random();
		int piece = 0;
		piece = random.nextInt(100); // 1/3 de chance
		if(piece < 11) return true;
		return false;
	}
}
