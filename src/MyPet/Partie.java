package MyPet;
import java.util.Scanner;

import Bonus.Chifumi;
import Bonus.Magicien;
import Bonus.Signes;

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
		compteurJours = compteurJours + 1;
	}

	public boolean testJourneeEcoulee() {
		if(pet.getTempo()>=12) {
			journeeEcoulee();
			pet.setTempo(0);
			return true;
		}
		return false;
	}

	public int getCompteurJours() {
		return compteurJours;
	}

	public int lireInstruction() {
		String input;
		do {
            System.out.print("Que voulez-vous faire ? ");
			Scanner sc = new Scanner(System.in);
			input = sc.nextLine();
		}while (!isDigit(input));
		return Integer.parseInt(input);
	}

    private boolean isRightAct4RightPet(String input) {
        return (!pet.toString().split(":")[0].equals("Oeuf")) ? 0 < Integer.parseInt(input) && Integer.parseInt(input) < 7 : 1 < Integer.parseInt(input) && Integer.parseInt(input) < 6;
    }

    private boolean isDigit(String input) {
		return input.matches("[0-9][0-9]*") && isRightAct4RightPet(input);
	}

	public void evolution() {
		if(getPet().getDureeDeVie() == compteurJours) {
			if(getPet().getClass().getName() == "MyPet.Oeuf") {
				Enfant e = new Enfant(getPet().getPrenom());
				e.setBonheur(getPet().getBonheur());
				e.setEnergie(getPet().getEnergie());
				e.setFaim(getPet().getFaim());
				e.setSante(getPet().getSante());
				e.verifiePalier();
				e.setCaract(Caractere.getRandomCar());
				setPet(e);
				getPet().setDureeDeVie(4);
				System.out.println("ATTENTION!!! Il évolue ! On dirait qu'il a éclos !");
			}

			else if(getPet().getClass().getName() == "MyPet.Enfant") {
				Ado a = new Ado(getPet().getPrenom());
				a.setBonheur(getPet().getBonheur());
				a.setEnergie(getPet().getEnergie());
				a.setFaim(getPet().getFaim());
				a.setSante(getPet().getSante());
				a.verifiePalier();
				a.setCaract(Caractere.getRandomCar());
				setPet(a);
				getPet().setDureeDeVie(7);
				System.out.println("ATTENTION!!! Il évolue encore! C'est un ado maintenant.");
			}

			else if(getPet().getClass().getName() == "MyPet.Ado") {
				Adulte ad = new Adulte(getPet().getPrenom());
				ad.setBonheur(getPet().getBonheur());
				ad.setEnergie(getPet().getEnergie());
				ad.setFaim(getPet().getFaim());
				ad.setSante(getPet().getSante());
				ad.verifiePalier();
				ad.setCaract(Caractere.getRandomCar());
				setPet(ad);
				getPet().setDureeDeVie(13);
				System.out.println("ATTENTION!!! Il évolue une dernière fois! Il est très grand.");
			}

			else {
				System.out.println("Il est mort de vieillesse, bravo !");
				getPet().setSante(0);
			}
		}
	}

	public void chifumi() {
		Chifumi chif = new Chifumi();
		if (chif.combat(chif.saisie())) {
			System.out.println("Haha tu as gagné ! Tu as battu mon signe : " + Signes.getSigneAvecInt(chif.getiA()) + "\n");
		} else { System.out.println("Haha pas de chance ! Je t'ai battu avec mon signe :"+ Signes.getSigneAvecInt(chif.getiA()) + "\n");
		}
	}

	public void gobelet() {
		Magicien elMagus = new Magicien();
		if (elMagus.devinette(elMagus.saisie())){
			System.out.println("Wouah comment tu as fait !?\n");
		} else { System.out.println("Haha je t'ai bien eu !\n");
		}
	}
	
}
