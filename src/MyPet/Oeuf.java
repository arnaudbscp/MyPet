package MyPet;

public class Oeuf extends Personnage {

	public Oeuf(String prenom) {
		super(prenom);
		this.setDureeDeVie(1);
		this.setBonheur(5);
		this.setEnergie(5);
		this.setFaim(5);
		this.setSante(5);
		
		/* Initialisations des Paliers Oeufs*/
		this.maxBonheur=10;
		this.maxEnergie=10;
		this.maxFaim=10;
		this.maxSante=10;

		
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
	
	@Override
	public String messageInit() {
		return "__Bonjour, je suis un oeuf. Si tu t'occupes de moi, je pourrais bien devenir quelque chose d'autre... =^o^=__\n"
				+ "Tu peux me caresser, ça me rendrait sûrement plus heureux..."
				+ "Tu peux me soigner, si tu trouves que je n'ai pas l'air très en forme..."
				+ "Tu peux me laver, si j'ai une tâche sur le nez..."
				+ "Tu peux aussi me faire 'dormir', si je te parais fatigué..."
						+ "A TOI DE JOUER !";
	}
	

}
