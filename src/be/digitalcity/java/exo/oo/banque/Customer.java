package be.digitalcity.java.exo.oo.banque;

public interface Customer {

    double getSolde();
    void retrait(double montant);
    void depot(double montant);

}
