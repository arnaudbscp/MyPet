package MyPet;

import java.util.Random;

public enum Caractere {
Joyeux,
Feneant,
Triste,
Maladif;

	
	 public static Caractere getRandomCar() {
         Random random = new Random();
         return values()[random.nextInt(values().length)];
     }
	Caractere(){
		
	}
}
