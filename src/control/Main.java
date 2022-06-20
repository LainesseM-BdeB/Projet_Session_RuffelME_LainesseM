package control;

import model.Categorie;
import model.CompteDepense;
import model.Employe;

import java.io.IOException;
import java.time.LocalDate;
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
        CompteDepense compte1 = new CompteDepense(25.00, false, 18.83, 98.78, LocalDate.parse("2022-01-01"));
        CompteDepense compte2 = new CompteDepense(20.00, false,  14.83, 120.78, LocalDate.parse("2022-01-02"));
        CompteDepense compte3 = new CompteDepense(13.25, false, 15.47, 82.65, LocalDate.parse("2022-01-01"));
        CompteDepense compte4 = new CompteDepense(25.00, false, 18.83, 98.78, LocalDate.parse("2022-01-03"));
        CompteDepense compte5 = new CompteDepense(20.00, false, 14.83, 120.78, LocalDate.parse("2022-01-05"));
        CompteDepense compte6 = new CompteDepense(13.25, false, 15.47, 82.65, LocalDate.parse("2022-01-06"));

        Employe emp1 = new Employe(1, categories.get("Super"), compte1);
        Employe emp2 = new Employe(2, categories.get("Junior"), compte2);
        Employe emp3 = new Employe(3, categories.get("Senior"), compte4);
        emp1.getCompteDepenses().add(compte2);
        emp1.getCompteDepenses().add(compte5);
        emp1.getCompteDepenses().add(compte6);
        employes.put(emp1.getId(), emp1);
        employes.put(emp2.getId(), emp2);
        employes.put(emp3.getId(), emp3);

        CompteDepense compteTestEqual = new CompteDepense(25.00, false, 18.83, 98.78, LocalDate.parse("2022-01-01"));
        if (emp1.getCompteDepenses().contains(compteTestEqual)) {
            System.out.println("THIS IS THE SAME!");
        }

        try {
            save(employes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //TEST AREA ^^^^^
    }
}
