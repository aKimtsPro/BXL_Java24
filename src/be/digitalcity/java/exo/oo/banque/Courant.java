package be.digitalcity.java.exo.oo.banque;

public class Courant {

    private final String numero;
    private double solde;
    private double ligneDeCredit;
    private Personne titulaire;

    public Courant(String numero, Personne titulaire) {
        this.numero = numero;
        this.setTitulaire(titulaire);
    }

    public String getNumero() {
        return numero;
    }

    public double getSolde(){
        return solde;
    }

    private void setSolde(double solde){
        this.solde = solde;
    }

    public double getLigneDeCredit(){
        return ligneDeCredit;
    }

    public void setLigneDeCredit(double ligneDeCredit){
        if( ligneDeCredit >= 0 )
            this.ligneDeCredit = ligneDeCredit;
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

    public void retrait(double montant){
        if(montant > 0 && montant <= solde + ligneDeCredit){
           solde -= montant;
        }
    }

    public void depot(double montant){
        if( montant > 0 ){
            solde += montant;
        }
    }

}
