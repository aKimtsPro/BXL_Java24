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


        b.getLivres().add(null);

    }


    public static void correctionPersonne(){
        Personne p1 = new Personne(LocalDate.of(2000,1,1), "Dubois", "Luc");
        Personne p2 = new Personne( LocalDate.now(),"Debois","Marie");

        p1.saluer(p2);
        p2.saluer(p1);
    }

}
