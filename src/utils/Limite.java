package utils;

import model.Categorie;
import model.CompteDepense;
import model.Employe;

public class Limite {

    public static boolean estDepasseDeplacement(Employe emp, Categorie cat, CompteDepense compte, Boolean isAvion) {
        if (isAvion) {
            double total = 0.0;
            for (CompteDepense ecompte : emp.getCompteDepenses()) {
                if (ecompte.getDateFrais().getMonth() == compte.getDateFrais().getMonth()) {
                    total += ecompte.getFraisDeplacement();
                }
            };
            return total >= 2000;
        } else {
            return compte.getFraisDeplacement() >= cat.getMontantMaxDeplacement();
        }
    }

    public static boolean estDepasseHebergement(Employe emp, Categorie cat, CompteDepense compte, Double montant) {
        double total = 0.0;
        for (CompteDepense ecompte : emp.getCompteDepenses()) {
            if (ecompte.getDateFrais().getMonth() == compte.getDateFrais().getMonth()) {
                total += ecompte.getFraisHebergement();
            }
        }
        return cat.getMontantMaxHebergement() < total + montant;
    }

    public static boolean estDepasseNourriture(Categorie cat, Double montant) {
        return cat.getMontantMaxBouffe() < montant;
    }

}
