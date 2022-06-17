package control;

import model.Categorie;
import model.CompteDepense;
import model.Employe;
import model.Frais;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Categorie catJunior = new Categorie("Junior", 1.0, 1.0, 1.0, false);
        Categorie catSenior = new Categorie("Senior", 1.0, 1.0, 1.0, false);
        Categorie catSuper = new Categorie("Super", 1.0, 1.0, 1.0, true);

        HashMap<String, Categorie> categories = new HashMap<>();

        categories.put("Junior", catJunior);
        categories.put("Senior", catSenior);
        categories.put("Super", catSuper);

        ArrayList<Employe> employes = new ArrayList<>();


        //TEST AREA vvvvv
        CompteDepense compte1 = new CompteDepense(25.00, 18.83, 98.78, LocalDate.parse("2022-01-01"));
        Frais frais = new Frais(compte1);
        frais.getFrais().add(compte1);
        Employe emp1 = new Employe(1, frais);
        System.out.println(emp1);
        employes.add(emp1);
        //TEST AREA ^^^^^
    }
}
