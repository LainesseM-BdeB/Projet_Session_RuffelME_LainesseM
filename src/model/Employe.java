package model;

import java.util.TreeSet;

public class Employe {

    private final int id;
    private final Categorie categorie;
    private final TreeSet<CompteDepense> compteDepenses;

    public Employe(int id, Categorie categorie) {
        this.id = id;
        this.categorie = categorie;
        this.compteDepenses = new TreeSet<>();
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

    public void addCompteDepense(CompteDepense cd) {
        this.compteDepenses.add(cd);
    }
}
