package be.digitalcity.java.exo.oo.competition;

import java.time.LocalDate;

public class Personne {

    String prenom;
    String nom;
    LocalDate dateNaiss;

    Personne(String prenom, String nom, LocalDate dateNaiss) {
        this.prenom = prenom;
        this.nom = nom;
        this.dateNaiss = dateNaiss;
    }

    void saluer(Personne aSaluer ){

        System.out.printf(
                "Bonjour %s, je m'appelle %s\n",
                aSaluer.getFullName(),
                this.getFullName()
        );

    }

    String getFullName(){
        if( this.nom == null )
            return this.prenom;

        return this.prenom + " " + this.nom;
    }

}
