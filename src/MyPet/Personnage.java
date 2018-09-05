package MyPet;

public abstract class Personnage {
	private String prenom;
	private int energie;
	private int faim;
	private int bonheur;
	private int sante;
	
	public Personnage(String prenom) {
		this.prenom = prenom;
	}

	public int getEnergie() {
		return energie;
	}

	public void setEnergie(int energie) {
		this.energie = energie;
	}

	public int getFaim() {
		return faim;
	}

	public void setFaim(int faim) {
		this.faim = faim;
	}

	public int getBonheur() {
		return bonheur;
	}

	public void setBonheur(int bonheur) {
		this.bonheur = bonheur;
	}

	public int getSante() {
		return sante;
	}

	public void setSante(int sante) {
		this.sante = sante;
	}

	public String getPrenom() {
		return prenom;
	}
	
}