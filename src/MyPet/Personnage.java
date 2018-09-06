package MyPet;

public abstract class Personnage {
	private String prenom;
	private int energie;
	private int faim;
	private int bonheur;
	private int sante;
	private int tempo;
	private int dureeDeVie;
	private Caractere caract;
	
	public Caractere getCaract() {
		return caract;
	}

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
		dureeDeVie = 1;
		this.tempo = 0;
		caract = Caractere.Neutre;
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
	
	public void setCaract(Caractere c) {
		this.caract=c;
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
	
	void effetCaractere(Personnage perso) {
		switch(perso.caract) {
		
		case Joyeux : perso.setBonheur(perso.getBonheur()+1);
		System.out.println("Il a l'air d'être joyeux de nature...");
			break;
			
		case Feneant : perso.setEnergie(perso.getEnergie()-1);
		System.out.println("Il a l'air d'être fainéant de nature...");
			break;
			
		case Triste : perso.setBonheur(perso.getBonheur()-1);
		System.out.println("Il a l'air d'être triste de nature...");
			break;
			
		case Maladif : perso.setSante(perso.getSante()-1);
		System.out.println("Il a l'air d'être facilement malade...");
			break;
			
		case Affame : perso.setFaim(perso.getFaim()-1);
		System.out.println("Il a l'air d'avoir faim, non?...");
			break;
			
		case Rassasie : perso.setFaim(perso.getFaim()+1);
		System.out.println("Il a l'air d'être gourmand...");
			break;
			
		default:
			break;
		}
	}
	
	
	abstract int soigner();
	abstract int dormir();
	abstract int laver();
	abstract int caresser();
	abstract int mangerBoire();
	abstract int jouer();
	abstract String messageInit();
	
	public boolean estMort() {
		if(jaugeVide(sante) || (tempo/12)==13) return true;
		return false;
	}
	
	public boolean estAffame() {
		if(jaugeVide(faim)) return true;
		return false;
	}
	
	public boolean estTriste() {
		if(jaugeVide(bonheur)) return true;
		return false;
	}
	
	public boolean estEpuise() {
		if(jaugeVide(energie)) return true;
		return false;
	}//Todo : méthode mettant toutes les options à dormir
	
	public void perteSante() {
		setSante(sante-1);
	}
	
	public void perteEnergie() {
		setEnergie(energie-1);
	}
	
	@Override
	public String toString() {
		return "DORMIR;SOIGNER;CARESSER;LAVER";
	}
}