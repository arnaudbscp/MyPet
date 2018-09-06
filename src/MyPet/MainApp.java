package MyPet;

public class MainApp {

	public static void main(String[] args) {
		Partie partie = new Partie("Caliméro");
		Personnage perso = partie.getPet();
        System.out.println(perso.messageInit());
        int tempo = 0;
		
		while(!perso.estMort()) {
			perso = partie.getPet();
			tempo = perso.getTempo();
			PetAfficheur.printPersonnage(perso);
			int choix  = partie.lireInstruction();
			switch(choix) {
				case 1:
					tempo += perso.mangerBoire();
					break;
				case 2:
					tempo += perso.dormir();
					break;
				case 3:
					tempo += perso.soigner();
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
