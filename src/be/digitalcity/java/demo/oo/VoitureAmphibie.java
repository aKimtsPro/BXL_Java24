package be.digitalcity.java.demo.oo;

public class VoitureAmphibie extends Voiture implements Amphibie {

    private boolean modeAquatique;

    public VoitureAmphibie(String marque, String modele) {
        super(marque, modele, 1);
    }

    @Override
    public void seDeplacer(int kmParcouru) {
        if(modeAquatique){
            naviger(kmParcouru);
        }
        else{
            rouler(kmParcouru);
        }
    }

    @Override
    public void seGarer() {
        System.out.println("parfois au port parfois sur terre");
    }

    @Override
    public void naviger(int distance) {
        System.out.println("Plouf mais amphibie");
        seDeplacer(distance);
    }

    @Override
    public void rouler(int distance) {
        System.out.println("Vroom mais amphibie");
        seDeplacer(distance);
    }

    @Override
    public boolean getMode() {
        return modeAquatique;
    }

    @Override
    public void setMode(boolean modeAquatique) {
        this.modeAquatique = modeAquatique;
    }
}
