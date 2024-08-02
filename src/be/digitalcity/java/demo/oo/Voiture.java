package be.digitalcity.java.demo.oo;


import java.util.HashSet;
import java.util.Set;

public class Voiture extends Vehicule implements Roulant {

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

    @Override
    public boolean equals(Object object) {
        return super.equals(object) &&
            this.nbrPortes == ((Voiture) object).nbrPortes;
    }

    @Override
    public void seGarer() {
        System.out.println("Je prend une place de parking");
    }

    @Override
    public void rouler(int distance) {
        System.out.println("vroom");
        seDeplacer(distance);
    }
}
