package be.digitalcity.java.exo.oo.competition;

import java.time.LocalDate;

public abstract class Sportif extends Personne implements Competiteur {

    public Sportif(String prenom, String nom, LocalDate dateNaiss) {
        super(prenom, nom, dateNaiss);
    }

}
