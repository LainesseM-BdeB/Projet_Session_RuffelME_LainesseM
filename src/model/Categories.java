package model;

import java.util.HashMap;

public class Categories {

    static HashMap<String, Categorie> categories = new HashMap<>();

    public Categories() {
    }

    public static HashMap<String, Categorie> getCategories() {
        return categories;
    }

    public static Categorie getCategorie(String cat) {
        return categories.get(cat);
    }

    public static void addCategories(Categorie cat) {
        categories.put(cat.getType(), cat);
    }

}
