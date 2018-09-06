package MyPet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class PetAfficheur {
    public static void printStart(){
        String start = ".___  ___. ____    ____    .______    _______ .___________.\n" +
                "|   \\/   | \\   \\  /   /    |   _  \\  |   ____||           |\n" +
                "|  \\  /  |  \\   \\/   /     |  |_)  | |  |__   `---|  |----`\n" +
                "|  |\\/|  |   \\_    _/      |   ___/  |   __|      |  |     \n" +
                "|  |  |  |     |  |        |  |      |  |____     |  |     \n" +
                "|__|  |__|     |__|        | _|      |_______|    |__|     \n" +
                "\n---------------------- NEW GAME ------------------------------\n" ;
        System.out.println(start);
    }

    public static void printDead(){
        String dead = "        -|-\n" +
                "         |\n" +
                "     .-'~~~`-.\n" +
                "   .'         `.\n" +
                "   |  R  I  P  |\n" +
                "   |           |\n" +
                "   |           |\n" +
                " \\\\|           |//\n" +
                "^^^^^^^^^^^^^^^^^^^^\n" ;
        System.out.println(dead);
    }
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
                            values[1] = values[1].replace("pet.nom", personnage.getPrenom().toUpperCase());
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
                    if(identite[0].equals("Oeuf")){
                        int nbCar = "   +------------------- MENU ------------------+".length();
                        switch (idxLine){
                            case 13:
                                values[1] = "  |                                           |";
                                break;
                            case 18:
                                values[1] = "  |                                           |";
                                break;
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
