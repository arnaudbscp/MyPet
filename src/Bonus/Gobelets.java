package Bonus;

import java.util.Random;

import MyPet.Caractere;

public enum Gobelets {

	Droit(2),
	Milieu(1),
	Gauche(0);
	
	private int position;
	
	Gobelets(int i){
		position=i;
	}
	
	public static Gobelets getRandomGobelet() {
		Random random = new Random();
		return values()[random.nextInt(values().length)];
	}
	
	public int getPosition() {
		return position;
	}
}
