package Bonus;

import java.util.Random;
import java.util.Scanner;

public class Chifumi {
	private int iA;
	
	public Chifumi() {
		iA = Signes.getRandomSigne().getNumero();
	}
	
	public boolean combat(int input) {
		if (input==iA) return combat(saisie());
		if (input==0) return iA==2;
		if (input==1) return iA==0;
		if (input==2) return iA==1;
		return false;
	}
	
	public int getiA() {
		return iA;
	}
	
	public int saisie() {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Ton Pet veux jouer a Chifumi ! \n Quel signe veux-tu jouer ? "
				+ "Pierre : 0, Papier : 1, Ciseau : 2.\n");
		
		String input = sc.nextLine();
		if (input.equals("0")||input.equals("1")||input.equals("2")) {
			return Integer.parseInt(input);
		}
		sc.close();
		return rand.nextInt(2);
	}
}
