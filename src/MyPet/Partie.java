package MyPet;

public class Partie {
	private Personnage pet;
	private int compteurJours;
	//private PetAfficheur petAfficheur;
	
	public Partie(Personnage pet /*, PetAfficheur petAfficheur*/) {
		this.pet = pet;
		this.compteurJours = 0;
		//this.petAfficheur = petAfficheur;
	}
	
	public boolean testJourneeEcoulee() {
		if(pet.getTempo()%12 == 0) return true;
		return false;
	}
	
	public void finDePartie() {
		//petAfficheur.affichageFin();
		//PetAfficheur.affichageDebut();
	}

}
