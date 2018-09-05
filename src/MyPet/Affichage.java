package MyPet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class PetAfficheur {
    public static void printPersonnage(Personnage personnage){
        String affichage = "";
        try {
            BufferedReader brStat = new BufferedReader(new FileReader("resources/affichageStat.txt"));
            //BufferedReader brPerso = new BufferedReader(new FileReader("resources/affichagePerso.txt"));
            try {
                String jauge = brStat.readLine();
                //String perso = brPerso.readLine()
                while(jauge != null){
                    affichage += jauge;
                }
                /*while(perso != null){
                    affichage += perso;
                }
                brPerso.close();*/
                brStat.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(affichage);

    }
    public static void printMenu(){

    }
}
