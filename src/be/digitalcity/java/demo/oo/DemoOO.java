package be.digitalcity.java.demo.oo;

import be.digitalcity.java.demo.oo.acces.Berline;

public class DemoOO {

    public static void main(String[] args) {

        Voiture v1 = new Voiture();
        v1.setMarque("Mark1");
        v1.setMarque("BipBoup");

        Bateau b1 = new Bateau();
        b1.setMarque("Mark2");
        b1.setModele("Model2");
        b1.setNbrVoiles(3);

        Vehicule veh1 = v1;
        Vehicule veh2 = b1;
        veh1 = new Berline();

        if( veh1 instanceof Bateau ) {
            System.out.println("est un bateau");
            b1 = (Bateau) veh1;
        }
        else if (veh1 instanceof Voiture) {
            System.out.println("est une voiture");
            v1 = (Voiture) veh1;
        }


    }


    public static void demoEncaps() {
        Voiture voit1 = new Voiture();
//        voit1.marque = "Mark1";
//        voit1.modele = "BipBoup";
        voit1.setMarque("Mark1");
        voit1.setMarque("BipBoup");

//        voit1.marque = voit1.marque + "2";
        voit1.setMarque( voit1.getMarque() + "2" );


        voit1.seDeplacer(15);

        Voiture voit2 = new Voiture();
        voit2.setMarque("Mark2");
        voit2.setModele("BipBoup");

        voit2.seDeplacer(25);
    }

}
