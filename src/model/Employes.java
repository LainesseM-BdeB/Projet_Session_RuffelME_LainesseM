package model;

import java.util.HashMap;

public class Employes {

    static HashMap<Integer, Employe> employes = new HashMap<>();

    public Employes() {
    }

     static public HashMap<Integer, Employe> getEmployes() {
        return employes;
    }

    static public void addEmploye(Employe emp) {
        employes.put(emp.getId(), emp);
    }

    static public Employe getEmploye(Integer empID) {
        return employes.get(empID);
    }

    static public boolean checkEmploye(Integer empID) {
        return employes.containsKey(empID);
    }

}
