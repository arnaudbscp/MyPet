package MyPet;

public abstract class Personnage {
	private String prenom;
	private int energie;
	private int faim;
	private int bonheur;
	private int sante;
	private int tempo;
	private int dureeDeVie;
	
	/* Declaration des variables des Paliers (personnage) */
	int maxEnergie; 
	int maxFaim; 
	int maxSante; 
	int maxBonheur; 
	
	
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
	
	/* Vérifie si un palier max ou min a été trangressé, le corige et renvoie 'false' si c'est le cas. Version pour les tests.*/
	boolean verifiePalierBoolean() {
		boolean validite = true;
		/* Test si les valeurs dépassent le max et correction*/
		if (this.faim>this.maxFaim) { this.faim=this.maxFaim;validite=false;}
		if (this.sante>this.maxSante) { this.sante=this.maxSante;validite=false;}
		if (this.energie>this.maxEnergie) { this.energie=this.maxEnergie;validite=false;}
		if (this.bonheur>this.maxBonheur) { this.bonheur=this.maxBonheur;validite=false;}
		/* Test si les valeurs sont sous le min et correction*/
		if (this.faim<0) { this.faim=0;validite=false;}
		if (this.sante<0) { this.sante=0;validite=false;}
		if (this.energie<0) { this.energie=0;validite=false;}
		if (this.bonheur<0) { this.bonheur=0;validite=false;}
		return validite;
	}
	
	void verifiePalier() {
		/* Test si les valeurs dépassent le max et correction*/
		if (this.getFaim()>this.maxFaim) { this.setFaim(this.maxFaim);}
		if (this.getSante()>this.maxSante) { this.setSante(this.maxSante);}
		if (this.getEnergie()>this.maxEnergie) { this.setEnergie(this.maxEnergie);}
		if (this.getBonheur()>this.maxBonheur) { this.setBonheur(this.maxBonheur);}
		/* Test si les valeurs sont sous le min et correction*/
		if (this.getFaim()<0) { this.setFaim(0);}
		if (this.getSante()<0) { this.setSante(0);}
		if (this.getEnergie()<0) { this.setEnergie(0);}
		if (this.getBonheur()<0) { this.setBonheur(0);}
	}
	
	abstract int soigner();
	abstract int dormir();
	abstract int laver();
	abstract int caresser();
	abstract int mangerBoire();
	abstract int jouer();
	abstract String messageInit();
	
	public boolean estMort() {
		if(jaugeVide(this.sante) || jaugeVide(this.faim) || (tempo/12)==13) return true;
		return false;
	}

	@Override
	public String toString() {
		return "";
	}
}