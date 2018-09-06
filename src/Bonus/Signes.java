package Bonus;

import java.util.Random;

import MyPet.Caractere;

public enum Signes {
	pierre("pierre", 0),
	papier("papier", 1),
	ciseaux("ciseaux", 2);
	
	private String signe;
	private int numero;
	
	public String getSigne() {
		return signe;
	}
	
	Signes (String s, int num){
		signe = s;
		numero = num;
	}
	
	public static Signes getRandomSigne() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
