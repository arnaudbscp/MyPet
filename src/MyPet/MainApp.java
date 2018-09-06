package MyPet;

public class MainApp {

	public static void main(String[] args) {
		Partie partie = new Partie("Caliméro");
		Personnage perso = partie.getPet();
		Evenements e = new Evenements(perso);
        System.out.println(perso.messageInit());
        int tempo = 0;
		
		while(!perso.estMort()) {
			perso = partie.getPet();
			tempo = perso.getTempo();
			
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
					tempo += perso.mangerBoire();
					if(e.seProduit()) {
						e.estMalade();
					}
					break;
				case 2:
					tempo += perso.dormir();
					if(e.seProduit()) {
						e.peurDuNoir();
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
					tempo += perso.jouer();
					break;
				case 6:
					tempo += perso.laver();
					break;
				default:
					System.out.println("Instruction incorrecte.");
				}
			perso.effetCaractere();
			perso.verifiePalier();
			perso.setTempo(tempo);
			
			if(partie.testJourneeEcoulee());
			
			System.out.println("Tempo " + perso.getTempo());
			System.out.println("Jour numéro " + partie.getCompteurJours());
			
			partie.evolution();
		}
		
		PetAfficheur.printPersonnage(perso);

		if(perso.estMort()) {
			System.out.println("Il est mort prématurément, le pauvre.");
		}

	}

}
