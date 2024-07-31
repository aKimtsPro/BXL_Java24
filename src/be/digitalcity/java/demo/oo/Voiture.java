package be.digitalcity.java.demo.oo;


public class Voiture extends Vehicule {

    private int nbrPortes;

    protected Voiture(String marque, int nbrPortes){
        this(marque, marque, nbrPortes);
    }

    public Voiture(String marque, String modele, int nbrPortes){
        super(marque, modele);
        this.nbrPortes = nbrPortes;
    }

    public int getNbrPortes() {
        return nbrPortes;
    }

    public void setNbrPortes(int nbrPortes) {
        this.nbrPortes = nbrPortes;
    }

    @Override
    public void seDeplacer(int kmParcouru){
        System.out.println("Vroom");
        super.seDeplacer(kmParcouru);
    }

}
