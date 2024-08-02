package be.digitalcity.java.exo.oo.banque;

import java.time.LocalDateTime;

public abstract class Compte implements Banker {
    private final String numero;
    private double solde;
    private Personne titulaire;

    public Compte(String numero, Personne titulaire) {
        this.numero = numero;
        this.titulaire = titulaire;
    }

    // region GET/SET
    @Override
    public String getNumero() {
        return numero;
    }

    @Override
    public double getSolde() {
        return solde;
    }

    private void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
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

    @Override
    public void retrait(double montant){
        if( montant > 0 )
            solde -= montant;
    }


    @Override
    public void depot(double montant){
        if( montant > 0 )
            solde+= montant;
    }

    protected abstract double calculInteret();

    @Override
    public void appliquerInteret(){
        setSolde( getSolde() + calculInteret() );
    }

    // endregion
}
