package MyPet;

public class Enfant extends Personnage {
	
	public Enfant(String prenom) {
		super(prenom);

		this.setDureeDeVie(3);
		/* Initialisations des Paliers Enfants */
		this.maxBonheur=9;
		this.maxEnergie=3;
		this.maxFaim=3;
		this.maxSante=3;

	}

	@Override
	public int soigner() {
		this.setSante(this.getSante()+2);
		this.setEnergie(this.getEnergie()+1);
		this.setBonheur(this.getBonheur()-1);
		return 2;
	}

	@Override
	public int dormir() {
		this.setEnergie(this.getEnergie()+2);
		this.setFaim(this.getFaim()+1);
		this.setSante(this.getSante()-1);
		return 6;
	}

	@Override
	public int laver() {
		this.setBonheur(getBonheur()+1);
		this.setEnergie(getEnergie()-1);
		return 1;
	}

	@Override
	public int caresser() {
		this.setBonheur(getBonheur()+2);
		return 1;
	}

	@Override
	public int mangerBoire() {
		this.setFaim(getFaim()+2);
		this.setEnergie(getEnergie()+1);
		this.setSante(getSante()-2);
		return 3;
	}

	@Override
	public int jouer() {
		this.setBonheur(this.getBonheur()+2);
		this.setEnergie(getEnergie()-3);
		this.setFaim(getFaim()-1);
		return 3;
	}
	
	@Override
	public String messageInit() {
		return "__Hé, j'ai grandi ! Tu as bien pris soin moi on dirait.__"
				+ "Maintenant que je suis sorti de mon oeuf, tu vas pouvoir faire plus de choses avec moi !"
				+ "Je peux désormais être nourri, mais attention à ma santé..."
				+ "Tu peux aussi jouer avec moi, ce qui me demandera peut-être un peu d'énergie, mais me rendra heureux."
				+ "C'EST A TOI DE JOUER !\n";
	}

	@Override
	public String toString() {
		return "Enfant:MANGER|DORMIR|SE SOIGNER|CARESSER|JOUER|LAVER";
	}
}
