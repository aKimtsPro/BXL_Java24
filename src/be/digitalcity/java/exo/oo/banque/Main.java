package be.digitalcity.java.exo.oo.banque;

public class Main {
    public static void main(String[] args) {

        Courant c = new Courant("", null);
        System.out.println(c.getTitulaire());

        System.out.println(
                c.getTitulaire().getNom()
        );

    }
}
