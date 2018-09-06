package Bonus;

import java.util.Random;
import java.util.Scanner;

public class Magicien {

	private Gobelets leMagicienne;
	
	public Magicien() {
		leMagicienne=Gobelets.getRandomGobelet();
	}
	
	public Gobelets getMagicien() {
		return leMagicienne;
	}

	public boolean devinette(int choix) {
		return choix==leMagicienne.getPosition();
	}
	
	public int saisie() {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Quel gobelet choisis tu ? \n"
				+ "Gauche : 0, Milieu : 1, Droit : 2.\n");
		
		String input = sc.nextLine();
		if (input.equals("0")||input.equals("1")||input.equals("2")) {
			return Integer.parseInt(input);
		}
		sc.close();
		return rand.nextInt(2);
	}
}

