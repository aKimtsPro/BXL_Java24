package be.digitalcity.java.exo.oo;

public class Personne {

    String prenom;
    String nom;

    void saluer( Personne aSaluer ){

        System.out.printf(
                "Bonjour %s %s, je m'appelle %s %s\n",
                aSaluer.prenom,
                aSaluer.nom,
                this.prenom,
                this.nom
        );
    }

}
