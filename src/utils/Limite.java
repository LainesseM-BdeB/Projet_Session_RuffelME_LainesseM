package utils;

import model.Categorie;
import model.CompteDepense;
import model.Employe;
import model.Response;

import java.util.ArrayList;

public class Limite {

    public static Response estDepasseDeplacement(Employe emp, Categorie cat, CompteDepense compte, Boolean isAvion) {
        if (isAvion) {
            double total = 0.0;
            for (CompteDepense ecompte : emp.getCompteDepenses()) {
                if (ecompte.getDateFrais().getMonth() == compte.getDateFrais().getMonth() && ecompte.isAvion() && !ecompte.equals(compte)) {
                    total += ecompte.getFraisDeplacement();
                }
            }
            if (total + compte.getFraisDeplacement() >= 2000) {
                return new Response(true, -(2000 - total - compte.getFraisDeplacement()));
            } else {
                return new Response(false, 0.0);
            }
        } else {
            if (compte.getFraisDeplacement() > cat.getMontantMaxDeplacement()) {
                return new Response(true, -(cat.getMontantMaxDeplacement() - compte.getFraisDeplacement()));
            } else {
                return new Response(false, 0.0);
            }
        }
    }

    public static Response estDepasseHebergement(Employe emp, Categorie cat, CompteDepense compte) {
        double total = 0.0;
        for (CompteDepense ecompte : emp.getCompteDepenses()) {
            if (ecompte.getDateFrais().getMonth() == compte.getDateFrais().getMonth() && !ecompte.equals(compte)) {
                total += ecompte.getFraisHebergement();
            }
        }
        if (cat.getMontantMaxHebergement() < total + compte.getFraisHebergement()) {
            return new Response(true, -(cat.getMontantMaxHebergement() - total - compte.getFraisHebergement()));
        } else {
            return new Response(false, 0.0);
        }
    }

    public static Response estDepasseNourriture(Categorie cat, Double montant) {
        if (cat.getMontantMaxBouffe() < montant) {
            return new Response(true, montant - cat.getMontantMaxBouffe());
        } else {
            return new Response(false, montant);
        }
    }



}
