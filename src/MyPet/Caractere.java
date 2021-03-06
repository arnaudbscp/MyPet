package MyPet;

import java.util.Random;

public enum Caractere {
    Joyeux("JOYEUX: :)"),
    Feneant("FENEANT: (*_*)"),
    Triste("TRISTE: :(("),
    Maladif("MALADIF: \uD83D\uDE20"),
    Neutre("NEUTRE : O^O"), 
    Affame("AFFAME : 'O'"),
    Rassasie("RASSASIE : ~^~");

    private String caractere;

    public String getCaractere() {
        return caractere;
    }

    Caractere(String s) {
        this.caractere = s;
    }

    public static Caractere getRandomCar() {
         Random random = new Random();
         return values()[random.nextInt(values().length)];
     }

	public void setCaractere(String caractere) {
		this.caractere = caractere;
	}
	
}
