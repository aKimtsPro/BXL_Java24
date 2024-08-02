package be.digitalcity.java.exo.oo.banque;

public interface Banker extends Customer {

    void appliquerInteret();
    Personne getTitulaire();
    String getNumero();

}
