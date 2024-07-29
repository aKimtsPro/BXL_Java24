package be.digitalcity.java.exo.oo;

import java.time.LocalDate;

public class Livre {

    String titre;
    String auteur;
    LocalDate dateParution;

    Livre(String titre, String auteur){
        this(titre, auteur, LocalDate.now());
//        this.titre = titre;
//        this.auteur = auteur;
//        this.dateParution = LocalDate.now();
    }

    Livre(String titre, String auteur, LocalDate dateParution){
        this.titre = titre;
        this.auteur = auteur;
        this.dateParution = dateParution;
    }

}
