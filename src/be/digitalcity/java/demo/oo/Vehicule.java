package be.digitalcity.java.demo.oo;

public class Vehicule {
    private String marque;
    private String modele;
    private int kmParcouru;

    public Vehicule(String marque, String modele) {
        this.marque = marque;
        this.modele = modele;
    }

    protected void seDeplacer(int kmParcouru){
        System.out.println( this.marque );
        this.kmParcouru += kmParcouru;
    }

    public int getKmParcouru() {
        return kmParcouru;
    }

    private void setKmParcouru(int kmParcouru) {
        if( kmParcouru >= 0)
            this.kmParcouru = kmParcouru;
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
