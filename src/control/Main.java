package control;

import model.Categorie;
import model.CompteDepense;
import model.Employe;
import model.Frais;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

import static io.SaveEmploye.save;

public class Main {

    public static void main(String[] args) {
        Categorie catJunior = new Categorie("Junior", 1.0, 1.0, 1.0, false);
        Categorie catSenior = new Categorie("Senior", 1.0, 1.0, 1.0, false);
        Categorie catSuper = new Categorie("Super", 1.0, 1.0, 1.0, true);

        HashMap<String, Categorie> categories = new HashMap<>();

        categories.put("Junior", catJunior);
        categories.put("Senior", catSenior);
        categories.put("Super", catSuper);

        HashMap<Integer, Employe> employes = new HashMap<>();


        //TEST AREA vvvvv
        CompteDepense compte1 = new CompteDepense(25.00, 18.83, 98.78, LocalDate.parse("2022-01-01"));
        CompteDepense compte2 = new CompteDepense(20.00, 14.83, 120.78, LocalDate.parse("2022-01-02"));
        CompteDepense compte3 = new CompteDepense(13.25, 15.47, 82.65, LocalDate.parse("2022-01-01"));
        Frais frais1 = new Frais(compte1);
        Frais frais2 = new Frais(compte3);
        frais1.getFrais().add(compte1);
        Employe emp1 = new Employe(1, categories.get("Super"), frais1);
        Employe emp2 = new Employe(2, categories.get("Junior"), frais2);
        emp1.getFrais().getFrais().add(compte2);
        employes.put(emp1.getId(), emp1);
        employes.put(emp2.getId(), emp2);
        try {
            save(employes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //TEST AREA ^^^^^
    }
}
