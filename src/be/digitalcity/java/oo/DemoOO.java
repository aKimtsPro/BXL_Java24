package be.digitalcity.java.oo;

public class DemoOO {

    public static void main(String[] args) {

        Voiture voit1 = new Voiture();
        voit1.marque = "Mark1";
        voit1.modele = "BipBoup";

        voit1.seDeplacer(15);

        Voiture voit2 = new Voiture();
        voit2.marque = "Mark2";
        voit2.modele = "BipBoup";

        voit2.seDeplacer(25);

    }

}
