package be.digitalcity.java.demo.oo;

public class Voiture {

    private String marque = "Mark";
    private String modele;
    private int kmParcouru;

    protected void seDeplacer(int kmParcouru){
        System.out.println( this.marque );
        this.kmParcouru += kmParcouru;
    }

    private void setKmParcouru(int kmParcouru){
        if( kmParcouru > 0 )
            this.kmParcouru = kmParcouru;
    }

    public int getKmParcouru(){
        return this.kmParcouru;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }
}
