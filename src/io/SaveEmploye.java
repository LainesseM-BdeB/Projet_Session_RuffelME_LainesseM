package io;

import model.CompteDepense;
import model.Employe;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class SaveEmploye {

    public static void save(HashMap<Integer, Employe> employes) throws IOException {
        FileWriter fw = new FileWriter("./src/ressources/data/output.json");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("{");
        bw.newLine();
        bw.write("  ");
        bw.write("\"employes\": [");

        String temp;
        int level = 1;
        boolean firstEmp = true;

        for (Employe e : employes.values()) {
            if (!firstEmp) {
                bw.write(",");
            }
            bw.newLine();
            bw.write("    {");
            bw.newLine();
            bw.write("      ");
            bw.write("\"id\": \"" + e.getId() + "\",");
            bw.newLine();
            bw.write("      ");
            bw.write("\"categorie\": \"" + e.getCategorie().getType() + "\",");
            bw.newLine();
            bw.write("      ");
            bw.write("\"comptedepenses\": [");
            bw.newLine();

            boolean firstCD = true;

            for (CompteDepense cd : e.getFrais().getFrais()) {
                if (!firstCD) {
                    bw.write(",");
                    bw.newLine();
                }
                bw.write("        ");
                bw.write("{");
                bw.newLine();
                bw.write("          ");
                bw.write("\"date\": \"" + cd.getDateFrais() + "\",");
                bw.newLine();
                bw.write("          ");
                bw.write("\"fraisrepas\": \"" + cd.getFraisRepas() + "\",");
                bw.newLine();
                bw.write("          ");
                bw.write("\"fraisdeplacement\": \"" + cd.getFraisDeplacement() + "\",");
                bw.newLine();
                bw.write("          ");
                bw.write("\"fraishebergement\": \"" + cd.getFraisHebergement() + "\"");
                bw.newLine();
                bw.write("        ");
                bw.write("}");
                if (firstCD) {
                    firstCD = false;
                }
            }
            bw.newLine();
            bw.write("      ]");
            bw.newLine();
            bw.write("    }");
            if (firstEmp) {
                firstEmp = false;
            }
        }

        bw.newLine();
        bw.write("  ]");
        bw.newLine();
        bw.append("}");
        bw.close();
        fw.close();
    }

}
