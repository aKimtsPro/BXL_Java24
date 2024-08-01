package be.digitalcity.java.exo.oo.banque;

import java.time.LocalDateTime;

public class Compte extends Object {
    private final String numero;
    private double solde;
    private Personne titulaire;

    public Compte(String numero, Personne titulaire) {
        this.numero = numero;
        this.titulaire = titulaire;
    }

    // region GET/SET
    public String getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }

    private void setSolde(double solde) {
        this.solde = solde;
    }


    public Personne getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Personne titulaire) {
        if( titulaire != null )
            this.titulaire = titulaire;
        else
            throw new RuntimeException();
    }
    // endregion

    // region METHODS

    public void retrait(double montant){
        if( montant > 0 )
            solde -= montant;
    }


    public void depot(double montant){
        if( montant > 0 )
            solde+= montant;
    }

    // endregion
}
