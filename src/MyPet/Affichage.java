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
                String jauge = brStat.readLine();
                int i = 0;
                while(jauge != null){
                    switch (i+2){
                        case  2:
                            jauge = jauge.replace("pet.sante", personnage.getSante()+"");
                            jauge = jauge.replace("pet.nom", personnage.getPrenom() + "");
                            break;
                        case  6:
                            jauge = jauge.replace("pet.sante", personnage.getFaim()+"");
                            jauge = jauge.replace("pet.nom", (personnage.getTempo()%12)+"");
                            break;
                        case  10:
                            jauge = jauge.replace("pet.sante", personnage.getEnergie()+"");
                            break;
                        case  14:
                            jauge = jauge.replace("pet.sante", personnage.getBonheur()+"");
                            break;
                    }

                    res += jauge + "\n";
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
        return res;
    }
    public static void printPersonnage(Personnage personnage){
        String jauges = readTxt(personnage, "resources/affichageStat.txt");
        String perso = readTxt(personnage, "resources/PersonnageOeuf.txt");
        System.out.println(jauges);
        System.out.println(perso);
    }
}
