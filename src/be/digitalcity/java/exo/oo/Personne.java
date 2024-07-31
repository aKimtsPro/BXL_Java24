package be.digitalcity.java.exo.oo;

import java.time.LocalDate;

public class Personne {

    String prenom;
    String nom;
    final LocalDate dateNaiss;

    public Personne(LocalDate dateNaiss, String nom, String prenom) {
        this.dateNaiss = dateNaiss;
        this.nom = nom;
        this.prenom = prenom;
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
