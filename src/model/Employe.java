package model;

public class Employe {

    private int id;
    private Categorie categorie;
    private Frais frais;

    public Employe(int id, Categorie categorie, Frais frais) {
        this.id = id;
        this.categorie = categorie;
        this.frais = frais;
    }

    public int getId() {
        return id;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public Frais getFrais() {
        return frais;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", categorie=" + categorie +
                ", frais=" + frais +
                '}';
    }
}
