package be.digitalcity.java.oo;

public class Voiture {

    String marque = "Mark";
    String modele;
    int kmParcouru;

    void seDeplacer(int kmParcouru){
        System.out.println( this.marque );
        this.kmParcouru += kmParcouru;
    }

}
