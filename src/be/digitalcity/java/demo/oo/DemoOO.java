package be.digitalcity.java.demo.oo;

public class DemoOO {

    public static void main(String[] args) {

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
