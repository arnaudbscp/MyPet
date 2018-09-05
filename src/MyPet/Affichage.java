package MyPet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class PetAfficheur {
    public static void printPersonnage(Personnage personnage){
        String affichage = "PET\n";
        try {
            BufferedReader brStat = new BufferedReader(new FileReader("resources/affichageStat.txt"));
            try {
                String jauge = brStat.readLine();
                int i = 0;
                while(jauge != null){
                    jauge = ((i+2) == 2) ? jauge : jauge.replace("pet.sante", personnage.getSante()+"");
                    jauge = ((i+2) == 6) ? jauge : jauge.replace("pet.faim", personnage.getFaim()+"");
                    jauge = ((i+2) == 10) ? jauge : jauge.replace("pet.energie", personnage.getEnergie()+"");
                    jauge = ((i+2) == 14) ? jauge : jauge.replace("pet.bonheur", personnage.getBonheur()+"");
                    affichage += jauge + "\n";
                    jauge = brStat.readLine();
                    i++;
                }
                brStat.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(affichage);

    }

    public static void main(String[] args) {
        System.out.println("PETMY");
        PetAfficheur.printPersonnage(new Oeuf("Test"));
        System.out.println("Fin");
    }
}
