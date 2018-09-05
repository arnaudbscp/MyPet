package MyPet;

public class Adulte extends Personnage implements Actions{    
	public Adulte(String prenom) {
	    super(prenom);
	}    
	
	// avantage santé , -6 en energie, -4 en faim
	@Override
	public int soigner() {
	    this.setSante(getSante()+2);
	    this.setEnergie(getEnergie()-2);
	    return 1;
	}    
	
	@Override
	public int dormir() {
	    this.setEnergie(getEnergie()+3);
	    this.setFaim(getFaim()-2);
	    return 5;
	}    
	
	@Override
	public int laver() {
	    this.setBonheur(getBonheur()+1);
	    this.setEnergie(getEnergie()-1);
	    this.setSante(getSante()+1);
	    return 1;
	}    
	
	@Override
	public int caresser() {
	    this.setBonheur(getBonheur()+3);
	    this.setFaim(getFaim()-2);
	    this.setEnergie(getEnergie()-2);
	    return 3;
	}    
	
	@Override
	public int mangerBoire() {
	    this.setFaim(getFaim()+2);
	    this.setEnergie(getEnergie()-1);
	    return 2;
	}
	
	@Override
	public int jouer() {
	    this.setBonheur(getBonheur()+1);
	    this.setEnergie(getEnergie()-3);
	    this.setFaim(getFaim()-2);
	    return 0;
	}
}
