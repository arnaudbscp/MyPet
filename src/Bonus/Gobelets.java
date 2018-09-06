package Bonus;

import java.util.Random;

import MyPet.Caractere;

public enum Gobelets {

	Droit("Droite",2),
	Milieu("Milieu",1),
	Gauche("Gauche",0);
	
	private int position;
	private String intitule;
	
	Gobelets(String s, int i ){
		position=i;
		intitule=s;
	}
	
	public static Gobelets getRandomGobelet() {
		Random random = new Random();
		return values()[random.nextInt(values().length)];
	}
	
	public static String getSigneAvecInt(int i) {
		if (i==0) return "Gauche";
		if (i==1) return "Milieu";
		if (i==2) return "Droite";
		return "";
	}
	
	public int getPosition() {
		return position;
	}
}
