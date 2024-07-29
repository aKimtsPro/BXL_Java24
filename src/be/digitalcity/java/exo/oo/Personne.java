package be.digitalcity.java.exo.oo;

import java.time.LocalDate;

public class Personne {

    String prenom;
    String nom;
    LocalDate dateNaiss;

    void saluer( Personne aSaluer ){

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
