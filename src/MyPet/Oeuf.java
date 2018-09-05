package MyPet;

public class Oeuf extends Personnage implements Actions {

	public Oeuf(String prenom) {
		super(prenom);
		this.setDureeDeVie(1);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	/**
	 * toutes les fonctions return le tempo que prend sur l'horloge, seulement pour les actions possibles 
	 * avantage sur la santé et l'energie
	 */
	
	public int soigner() {
		this.setSante(this.getSante() + 2);
		this.setBonheur(this.getBonheur() - 2);
		return 2;
	}

	@Override
	public int dormir() {
		this.setEnergie(this.getEnergie() + 2);
		this.setBonheur(this.getBonheur() - 1);
		this.setSante(this.getSante() - 1);
		return 7;
	}

	@Override
	public int laver() {
		this.setBonheur(this.getBonheur() + 1);
		this.setEnergie(this.getEnergie() - 1);
		this.setSante(this.getSante() + 1);
		return 2;
	}

	@Override
	public int caresser() {
		this.setBonheur(this.getBonheur() + 2);
		this.setEnergie(this.getEnergie() + 1);
		return 2;
	}

	@Override
	public int mangerBoire() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int jouer() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
