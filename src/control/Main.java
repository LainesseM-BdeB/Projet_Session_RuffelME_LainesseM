package control;

import model.Categorie;
import model.CompteDepense;
import model.Frais;

import java.time.LocalDate;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Categorie catJunior = new Categorie("Junior", 1.0, 1.0, 1.0, false);
        Categorie catSenior = new Categorie("Senior", 1.0, 1.0, 1.0, false);
        Categorie catSuper = new Categorie("Super", 1.0, 1.0, 1.0, true);

        HashMap<String, Categorie> categories = new HashMap<>();

        categories.put("Junior", catJunior);
        categories.put("Senior", catSenior);
        categories.put("Super", catSuper);

        for (Categorie cat : categories.values()) {
            System.out.println(cat);
        }

        CompteDepense compte1 = new CompteDepense(25.00, 18.83, 98.78, LocalDate.parse("2022-01-01"));
        Frais frais = new Frais(compte1);
        System.out.println(frais.getFrais());
        frais.getFrais().add(compte1);
        System.out.println(frais.getFrais());
        CompteDepense compte2 = new CompteDepense(25.00, 18.83, 98.78, LocalDate.parse("2022-01-01"));
        System.out.println(frais.getFrais());
        for (CompteDepense compte : frais.getFrais()) {
            System.out.println(compte.getDateFrais() + " " + compte.getFraisDeplacement() + " " + compte.getFraisRepas() + " " + compte.getFraisHebergement());
        }
        System.out.println(compte2);

    }
}
