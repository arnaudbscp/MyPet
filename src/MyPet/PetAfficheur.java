package MyPet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class PetAfficheur {
    private static String readTxt(Personnage personnage, String resources){
        int niveauFaim = personnage.getFaim();
        int niveauEnergie = personnage.getEnergie();
        int niveauSante = personnage.getSante();
        int niveauBonheur = personnage.getBonheur();

        String res = "";
        String[] identite = personnage.toString().split(":");
        String[] caractes = identite[1].split(";");
        try {
            BufferedReader brStat = new BufferedReader(new FileReader(resources));
            try {
                String line = brStat.readLine();
                int idxLine = 1;
                while(line != null){
                    String[] values = line.split(";");
                    int indice = 1;
                    switch (idxLine){
                        case 4:
                            values[1] = values[1].replace("pet.nom", personnage.getPrenom());
                            break;
                        case 6:
                            values[1] = values[1].replace("faim", String.valueOf(niveauFaim));
                            values[1] = values[1].replace("jaugeFaim", printStat(niveauFaim, "☕") + "   ");
                            break;
                        case 7:
                            values[1] = values[1].replace("energie", String.valueOf(niveauEnergie));
                            values[1] = values[1].replace("jaugeEnergie", printStat(niveauEnergie, "⚡") + "   ");
                            break;
                        case 8:
                            values[1] = values[1].replace("bonheur", String.valueOf(niveauBonheur));
                            values[1] = values[1].replace("jaugeBonheur", printStat(niveauBonheur, "❤") + "   ");
                            break;
                        case 9:
                            values[1] = values[1].replace("sante", String.valueOf(niveauSante));
                            values[1] = values[1].replace("jaugeSante", printStat(niveauSante, "+") + "   ");
                            break;
                    }
                    if(!identite[0].equals("Oeuf")){
                        int nbCar = "   +------------------- MENU ------------------+".length();
                        switch (idxLine){
                            case 17:
                                values[0] += "  |   1 : "+caractes[4]+String.format("%"+(nbCar - caractes[4].length() - 11)+"s","|");
                                break;
                            case 18:
                                values[0] += "  |   5 : "+caractes[5]+String.format("%"+(nbCar - caractes[5].length() - 11)+"s","|");
                                break;
                            case 19:
                                values[0] += "  +-------------------------------------------+";
                                break;
                        }
                    }else{
                        if(idxLine == 17){
                            values[0] += "  +-------------------------------------------+";
                        }
                    }
                    res += (values.length == 2) ? values[0] + values[1] + "\n" : values[0] + "\n";
                    line = brStat.readLine();
                    idxLine++;
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
        System.out.println(readTxt(personnage, "resources/"+personnage.toString().split(":")[0]+".txt"));
    }

    private static String printStat(int niveau, String s) {
        String res = "";
        for (int i = 0; i < niveau; i++) {
            res += s;
        }
        return res;
    }
}
