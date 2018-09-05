package MyPet;

public abstract class Personnage {
	private String prenom;
	private int energie;
	private int faim;
	private int bonheur;
	private int sante;
	private int tempo;
	private int dureeDeVie;
	
	public int getDureeDeVie() {
		return dureeDeVie;
	}

	public void setDureeDeVie(int dureeDeVie) {
		this.dureeDeVie = dureeDeVie;
	}

	public Personnage(String prenom) {
		this.prenom = prenom;
		this.tempo = 0;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
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
	
	public boolean jaugeVide(int stat) {
		if(stat<=0) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean estMort() {
		if(jaugeVide(this.sante) || jaugeVide(this.faim) || (tempo/12)==13) return true;
		return false;
	}
	
}