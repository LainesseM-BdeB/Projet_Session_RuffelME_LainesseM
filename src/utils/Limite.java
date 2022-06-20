package utils;

import model.Categorie;
import model.CompteDepense;
import model.Employe;

public class Limite {

    public static boolean estDepasseDeplacement(Employe emp, Categorie cat, CompteDepense compte,Boolean isAvion) {
        if (isAvion) {
            Double total = 0.0;
            for (CompteDepense ecompte : emp.getCompteDepenses()) {
                if (ecompte.getDateFrais().getMonth() == compte.getDateFrais().getMonth()) {
                    total += ecompte.getFraisDeplacement();
                }
            };
            return total >= cat.getMontantMaxDeplacement();
        } else {
            return compte.getFraisDeplacement() >= cat.getMontantMaxDeplacement();
        }
    }

    public static boolean estDepasseHebergement(Categorie cat, Double montant) {
        return cat.getMontantMaxHebergement() < montant;
    }

    public static boolean estDepasseNourriture(Categorie cat, Double montant) {
        return cat.getMontantMaxBouffe() < montant;
    }

}
