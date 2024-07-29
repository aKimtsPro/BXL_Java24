package be.digitalcity.java.exo.oo;

import java.time.LocalDate;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Bibliotheque b = new Bibliotheque("Ma Bibli");
        Livre l = new Livre("blabla","blabla",LocalDate.now());
        l = new Livre("toto", "toto");

        b.ajouter(l);
//        b.retirer( b.chercherParTitre("blabla") );
        b.retirerParNom("blabla");

    }


    public static void correctionPersonne(){
        Personne p1 = new Personne();
        p1.prenom = "Luc";
        p1.nom = "Dubois";
        p1.dateNaiss = LocalDate.of(2000,1,1);

        Personne p2 = new Personne();
        p2.prenom = "Marie";
        p2.nom = "Debois";

        p1.saluer(p2);
        p2.saluer(p1);
    }

}
