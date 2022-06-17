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

    public String getType() {
        return type;
    }

    public Double getMontantMaxBouffe() {
        return montantMaxBouffe;
    }

    public Double getMontant2() {
        return montant2;
    }

    public Double getMontant3() {
        return montant3;
    }

    public Boolean getDroitAvion() {
        return droitAvion;
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
