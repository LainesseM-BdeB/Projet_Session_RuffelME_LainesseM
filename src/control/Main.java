package control;

import model.Categorie;

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

    }
}
