package MyPet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class PetAfficheur {
    private static String readTxt(Personnage personnage, String resources){
        String res = "";
        try {
            BufferedReader brStat = new BufferedReader(new FileReader(resources));
            try {
                String line = brStat.readLine();
                int i = 0;
                while(line != null){
                    res += line + "\n";
                    line = brStat.readLine();
                    i++;
                }
                brStat.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return res;
    }

    public static void printPersonnage(Personnage personnage){
        int niveauFaim = personnage.getFaim();
        int niveauEnergie = personnage.getEnergie();
        int niveauSante = personnage.getSante();
        int niveauBonheur = personnage.getBonheur();

        String perso = "";
        perso += "           ";
        perso += "Faim: ["+niveauFaim+"]"+printStat(niveauFaim, "☕") + "   ";
        perso += "Energie: ["+niveauEnergie+"]"+printStat(niveauEnergie, "⚡") + "   ";
        perso += "Bonheur: ["+niveauBonheur+"]"+printStat(niveauBonheur, "\uD83D\uDE00") + "   ";
        perso += "Santé: ["+niveauSante+"]"+printStat(niveauSante, "❤") + "   ";
        perso += "\n";

        perso += readTxt(personnage, "resources/PersonnageOeuf.txt");
        perso += "\n+========================================= Menu =========================================+\n";
        perso += "|  [1]: Manger - [2]: Dormir - [3]: Soigner - [4]: Carresser - [5]: Jouer - [6]: Laver   |";
        perso += "\n+========================================================================================+\n";
        System.out.println(perso);
    }

    private static String printStat(int niveau, String s) {
        String res = "";
        for (int i = 0; i < niveau; i++) {
            res += s;
        }
        return res;
    }
}
