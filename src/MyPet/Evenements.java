package MyPet;

import java.util.Random;

public class Evenements implements Aleas {
	private int piece;
	private Personnage pet;
	
	public Evenements(Personnage pet) {
		this.pet = pet;
	}

	@Override
	public boolean seProduit() {
		Random random = new Random();
		piece = random.nextInt(100); // 1/3 de chance
		if(piece < 34) return true;
		return false;
	}

	@Override
	public void estMalade() {
		System.out.println("[OOPSI] Oh non !!! Votre pet a eu la gastro... Il a faim à présent.");
		pet.setFaim(pet.getFaim()-1);
		pet.setSante(pet.getSante()-1);
	}

	@Override
	public void seSentTriste() {
		System.out.println("[OOPSI] Votre pet broie du noir. Il est moins heureux.");
		pet.setBonheur(pet.getBonheur()-1);
		
	}

	@Override
	public void peurDuNoir() {
		System.out.println("[OOPSI] Votre pet a eu un cauchemar ! Il a mal dormi.");
		pet.setEnergie(pet.getEnergie()-1);
	}

}
