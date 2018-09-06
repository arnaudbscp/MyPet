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
	
	public int getCompteurJours() {
		return compteurJours;
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
	
	public void evolution() { // modifier duree de vie du stade, diviser par deux le nb de jours (passe trop vite)
		System.out.println("a");
		if(getPet().getDureeDeVie() == compteurJours) {
			System.out.println("a");
			if(getPet().getClass().getName() == "MyPet.Oeuf") {
				Enfant e = new Enfant(getPet().getPrenom());
				setPet(e);
				getPet().setDureeDeVie(12);
				System.out.println("ATTENTION!!! Il évolue !");
			}else if(getPet().getClass().getName() == "MyPet.Enfant") {
				Ado a = new Ado(getPet().getPrenom());
				setPet(a);
				getPet().setDureeDeVie(12);
				System.out.println("ATTENTION!!! Il évolue encore!");
			}else if(getPet().getClass().getName() == "MyPet.Ado") {
				Adulte ad = new Adulte(getPet().getPrenom());
				setPet(ad);
				getPet().setDureeDeVie(12);
				System.out.println("ATTENTION!!! Il évolue une dernière fois!");
			}
			else {
				getPet().setSante(0);
				System.out.println("Il est mort de vieillesse, bravo !");
			}
		}
	}
}
