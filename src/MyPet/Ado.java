package MyPet;

public class Ado extends Personnage {
    
    public Ado(String prenom) {
        super(prenom);
    }
        @Override
    public int soigner() {
        this.setSante(getSante()+2);
        this.setEnergie(getEnergie()-1);
        return 1;
    }
    
    @Override
    public int dormir() {
        this.setEnergie(getEnergie()+3);
        this.setFaim(getFaim()-2);
        return 3;
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
        this.setBonheur(getBonheur()-1);
        this.setFaim(getFaim()-1);
        this.setEnergie(getEnergie()+1);
        return 1;
    }
    
    @Override
    public int mangerBoire() {
        this.setFaim(getFaim()+3);
        this.setEnergie(getEnergie()-2);
        return 2;
    }
    
    @Override
    public int jouer() {
        this.setBonheur(getBonheur()+2);
        this.setEnergie(getEnergie()-4);
        this.setFaim(getFaim()-3);
        return 5;
    }
    
    @Override
	public String messageInit() {
		return "";
	}
    
}