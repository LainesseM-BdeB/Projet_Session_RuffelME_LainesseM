package model;

import java.util.TreeSet;

public class Employe {

    private final int id;
    private final Categorie categorie;
    private final TreeSet<CompteDepense> compteDepenses;

    public Employe(int id, Categorie categorie, CompteDepense compteDepense) {
        this.id = id;
        this.categorie = categorie;
        this.compteDepenses = new TreeSet<>();
        this.compteDepenses.add(compteDepense);
    }

    public int getId() {
        return id;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public TreeSet<CompteDepense> getCompteDepenses() {
        return compteDepenses;
    }
}
