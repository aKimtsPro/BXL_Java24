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

    @Override
    public void seGarer() {
        System.out.println("Je prend une place au port");
    }
}
