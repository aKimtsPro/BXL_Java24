package be.digitalcity.java.exo.oo.competition;

import java.time.LocalDate;
import java.util.Random;

public class Nageur extends Sportif {

    private double coeffNage;

    public Nageur(String prenom, String nom, LocalDate dateNaiss, double coeffNage) {
        super(prenom, nom, dateNaiss);
        this.coeffNage = coeffNage;
    }

    public double getCoeffNage() {
        return coeffNage;
    }

    public void setCoeffNage(double coeffNage) {
        this.coeffNage = coeffNage;
    }

    @Override
    public double performer() {
        return coeffNage * new Random().nextDouble(1,3);
    }
}
