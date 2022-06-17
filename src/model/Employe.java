package model;

public class Employe {

    private int id;
    private Frais frais;

    public Employe(int id, Frais frais) {
        this.id = id;
        this.frais = frais;
    }

    public int getId() {
        return id;
    }

    public Frais getFrais() {
        return frais;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", frais=" + frais +
                '}';
    }
}
