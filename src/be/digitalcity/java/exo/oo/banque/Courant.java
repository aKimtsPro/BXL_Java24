package be.digitalcity.java.exo.oo.banque;

public class Courant extends Compte {

    private double ligneDeCredit;

    public Courant(String numero, Personne titulaire) {
        super(numero, titulaire);
    }

    // region GET/SET

    public double getLigneDeCredit(){
        return ligneDeCredit;
    }

    public void setLigneDeCredit(double ligneDeCredit){
        if( ligneDeCredit >= 0 )
            this.ligneDeCredit = ligneDeCredit;
    }

    // endregion

    // region METHODS

    @Override
    public void retrait(double montant){
        if( montant <= getSolde() + ligneDeCredit )
            super.retrait(montant);
    }

    // endregion

}
