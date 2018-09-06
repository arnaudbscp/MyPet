package MyPet;

public class main {

	public static void main(String[] args) {
		Partie partie = new Partie("Caliméro");
		
		Personnage perso = partie.getPet();
		PetAfficheur.printPersonnage(perso);
		
		while(!perso.estMort()) {
			int instruc = partie.lireInstruction();
			
			switch(instruc) {
			
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
		}
		PetAfficheur.printPersonnage(perso);

	}

}
