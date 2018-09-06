package MyPet;

public class MainApp {

	public static void main(String[] args) {
		Partie partie = new Partie("Caliméro");

		Personnage perso = partie.getPet();
		
		while(!perso.estMort()) {
			PetAfficheur.printPersonnage(perso);
			int choix  = partie.lireInstruction();
			switch(choix) {
				case 1:
					perso.mangerBoire();
					break;
				case 2:
					perso.dormir();
					break;
				case 3:
					perso.soigner();
					break;
				case 4:
					perso.caresser();
					break;
				case 5:
					perso.jouer();
					break;
				case 6:
					perso.laver();
					break;
				default:
					System.out.println("Instruction incorrecte.");
				}
			perso.verifiePalier();
		}
		
		PetAfficheur.printPersonnage(perso);

	}

}
