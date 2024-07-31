package be.digitalcity.java.demo.oo;

public class Bateau extends Vehicule {

    private int nbrVoiles;

    Bateau(String marque, String modele){
        super(marque, modele);
    }

    public int getNbrVoiles() {
        return nbrVoiles;
    }

    public void setNbrVoiles(int nbrVoiles) {
        this.nbrVoiles = nbrVoiles;
    }

}
