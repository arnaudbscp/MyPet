package MyPet;
import java.util.Scanner;

public class Partie {
	private Personnage pet;
	private int compteurJours;
	
	public Partie(String prenom) {
		this.pet = new Oeuf(prenom);
		compteurJours = 0;
	}
	
	
	public Personnage getPet() {
		return pet;
	}



	public void setPet(Personnage pet) {
		this.pet = pet;
	}



	public void journeeEcoulee() {
		this.compteurJours ++;
	}
	
	public boolean testJourneeEcoulee() {
		if(pet.getTempo()%12 == 0) {
			this.journeeEcoulee();
			return true;
		}
		return false;
	}
	
	public void finDePartie() {
		//Todo : Affichage de fin de partie
		PetAfficheur.printPersonnage(pet);
	}
	
	public int lireInstruction() {
		Scanner sc = new Scanner(System.in);
		String instruction = sc.nextLine();
		return Integer.parseInt(instruction);
	}
	
	public boolean verifEntree(int instruct) {
		return instruct >=1 && instruct <=6;
	}
}
