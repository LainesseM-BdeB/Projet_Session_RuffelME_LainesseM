package model;

import java.time.LocalDate;
import java.util.Comparator;

public class CompteDepense implements Comparable {

    private final double fraisDeplacement;
    private final double fraisRepas;
    private final double fraisHebergement;
    private final LocalDate dateFrais;
    private final boolean isAvion;

    public CompteDepense(double fraisDeplacement, Boolean avion, double fraisRepas, double fraisHebergement, LocalDate dateFrais) {
        this.fraisDeplacement = fraisDeplacement;
        this.fraisRepas = fraisRepas;
        this.fraisHebergement = fraisHebergement;
        this.dateFrais = dateFrais;
        this.isAvion = avion;
    }

    public double getFraisDeplacement() {
        return fraisDeplacement;
    }

    public double getFraisRepas() {
        return fraisRepas;
    }

    public double getFraisHebergement() {
        return fraisHebergement;
    }

    public LocalDate getDateFrais() {
        return dateFrais;
    }

    public boolean isAvion() {
        return isAvion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompteDepense that = (CompteDepense) o;
        return Double.compare(that.fraisDeplacement, fraisDeplacement) == 0 && Double.compare(that.fraisRepas, fraisRepas) == 0 && Double.compare(that.fraisHebergement, fraisHebergement) == 0 && dateFrais.equals(that.dateFrais);
    }

    @Override
    public int compareTo(Object o) {
        CompteDepense comparator = (CompteDepense) o;
        if (comparator.dateFrais.equals(this.dateFrais)
                && comparator.fraisDeplacement == this.fraisDeplacement
                && comparator.fraisHebergement == this.fraisHebergement
                && comparator.fraisDeplacement == this.fraisDeplacement) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "CompteDepense{" +
                "fraisDeplacement=" + fraisDeplacement +
                ", fraisRepas=" + fraisRepas +
                ", fraisHebergement=" + fraisHebergement +
                ", dateFrais=" + dateFrais +
                ", isAvion=" + isAvion +
                '}';
    }
}
