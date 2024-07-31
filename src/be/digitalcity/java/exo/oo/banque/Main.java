package be.digitalcity.java.exo.oo.banque;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Personne p = new Personne("luc", "dubois", LocalDate.EPOCH);

        Courant c = new Courant("", null);
        System.out.println(c.getTitulaire());

        System.out.println(
                c.getTitulaire().getNom()
        );

    }
}
