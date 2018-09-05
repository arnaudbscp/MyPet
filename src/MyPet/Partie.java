package MyPet;
import java.util.Scanner;

public class Partie {
	private Personnage pet;
	private int compteurJours;
	//private PetAfficheur petAfficheur;
	
	public Partie(String prenom /*, PetAfficheur petAfficheur*/) {
		this.pet = new Oeuf(prenom);
		this.compteurJours = 0;
		//this.petAfficheur = petAfficheur;
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
		//petAfficheur.affichageFin();
		//PetAfficheur.affichageDebut();
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
