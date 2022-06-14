package model;

public class Categorie {

    String type; //Junior, Senior, Super
    Double montantMaxBouffe;
    Double montant2;
    Double montant3;
    Boolean droitAvion;

    public Categorie(String type, Double montantMaxBouffe, Double montant2, Double montant3, Boolean droitAvion) {
        this.type = type;
        this.montantMaxBouffe = montantMaxBouffe;
        this.montant2 = montant2;
        this.montant3 = montant3;
        this.droitAvion = droitAvion;
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "type='" + type + '\'' +
                ", montantMaxBouffe=" + montantMaxBouffe +
                ", montant2=" + montant2 +
                ", montant3=" + montant3 +
                ", droitAvion=" + droitAvion +
                '}';
    }
}
