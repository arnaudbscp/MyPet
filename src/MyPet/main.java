package MyPet;

public class main {

	public static void main(String[] args) {
		Partie partie = new Partie("Caliméro");
		int instruc = 0;
		
		
		
		Personnage perso = partie.getPet();
		PetAfficheur.printPersonnage(perso);
		
		while(instruc < 1 || instruc > 7) {
			
			System.out.println("Que voulez-vous faire ?\n");
			instruc = partie.lireInstruction();
			System.out.println(instruc);
			
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
