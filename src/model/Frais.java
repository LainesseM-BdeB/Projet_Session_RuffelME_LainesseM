package model;


import java.util.TreeSet;

public class Frais {

    TreeSet<CompteDepense> frais;

    public Frais(CompteDepense compte) {
        this.frais = new TreeSet<>();
        this.frais.add(compte);
    }

    public TreeSet<CompteDepense> getFrais() {
        return frais;
    }

}
