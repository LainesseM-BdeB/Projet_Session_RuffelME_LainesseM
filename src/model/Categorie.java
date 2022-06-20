package model;

public class Categorie {

    String type; //Junior, Senior, Super
    Double montantMaxBouffe;
    Double montantMaxDeplacement;
    Double montantMaxHebergement;
    Boolean droitAvion;

    public Categorie(String type, Double montantMaxBouffe, Double montant2, Double montant3, Boolean droitAvion) {
        this.type = type;
        this.montantMaxBouffe = montantMaxBouffe;
        this.montantMaxDeplacement = montant2;
        this.montantMaxHebergement = montant3;
        this.droitAvion = droitAvion;
    }

    public String getType() {
        return type;
    }

    public Double getMontantMaxBouffe() {
        return montantMaxBouffe;
    }

    public Double getMontantMaxDeplacement() {
        return montantMaxDeplacement;
    }

    public Double getMontantMaxHebergement() {
        return montantMaxHebergement;
    }

    public Boolean getDroitAvion() {
        return droitAvion;
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "type='" + type + '\'' +
                ", montantMaxBouffe=" + montantMaxBouffe +
                ", montant2=" + montantMaxDeplacement +
                ", montant3=" + montantMaxHebergement +
                ", droitAvion=" + droitAvion +
                '}';
    }
}
