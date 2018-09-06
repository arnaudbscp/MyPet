package MyPet;

public class main {

	public static void main(String[] args) {
		Partie partie = new Partie("Caliméro");
		int instruc = 0;
		
		Personnage perso = partie.getPet();
		PetAfficheur.printPersonnage(perso);
		int i = 0;
		int tempo = perso.getTempo();
		while(i<35) {
			
			System.out.println("Que voulez-vous faire ?\n");
			instruc = partie.lireInstruction();
			
			switch(instruc) {
			
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
				tempo +=  perso.jouer();
				break;
				
			case 6:
				tempo += perso.laver();
				break;
			
			default:
				System.out.println("Instruction incorrecte.");
			}
			
			perso.setTempo(tempo);
			
			PetAfficheur.printPersonnage(perso);
			
			System.out.println(perso.getTempo());
			System.out.println(partie.getCompteurJours());
			
			if(partie.testJourneeEcoulee()) {
				partie.journeeEcoulee();
			}
			
			partie.evolution();
			
			i++;
		}
		
		

	}

}
