package be.digitalcity.java.exo.oo;

public class Main {

    public static void main(String[] args) {

        Personne p1 = new Personne();
        p1.prenom = "Luc";
        p1.nom = "Dubois";

        Personne p2 = new Personne();
        p2.prenom = "Marie";
        p2.nom = "Debois";

        p1.saluer(p2);
        p2.saluer(p1);

    }

}
