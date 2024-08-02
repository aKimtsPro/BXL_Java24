package be.digitalcity.java.demo.oo;

import be.digitalcity.java.demo.oo.acces.Berline;

import java.util.*;
import java.util.function.Predicate;

public class DemoOO {

    public static void main(String[] args) {

//        Vehicule vehicule = new Vehicule("", "");
        Vehicule v1 = new Voiture("", "", 3);
        Vehicule b1 = new Bateau("", "");
        Vehicule va1 = new VoitureAmphibie("", "");

        List<Vehicule> vehicules = new ArrayList<>();
        List<Voiture> voitures = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        Vehicule vehicule = getFirstVehicule(vehicules);
        Voiture voiture = getFirstVehicule(voitures);
        Bateau bateau = (Bateau) b1;

        Garage<Voiture> garage = new Garage<>();

        garage.parker( voiture );
        Voiture voiture1 = garage.quitterGarage();

        Garage<Bateau> port = new Garage<>();

        port.parker(bateau);
        Bateau bateau1 = port.quitterGarage();



//        Object o1 = getFirstVehicule(objects); // impossible : contrainte pas respectée sur T

        Amphibie amphibie = (Amphibie) va1;

        vehicules.add( v1 );
        vehicules.add( b1 );

        for (Vehicule veh : vehicules) {
            if( veh instanceof Roulant roulant)
                roulant.rouler(10);
            else if ( veh instanceof Navigable navigable )
                navigable.naviger(10);
        }

        Personne personne = new Personne("","");
        Personne personne2 = new Personne("","");

        personne.saluer(personne2, "salut");
        personne.saluer("salut", personne2);

    }


    public static void demoEncaps() {
        Voiture voit1 = new Voiture("Mark1", "BipBoup", 3);

//        voit1.marque = voit1.marque + "2";
        voit1.setMarque( voit1.getMarque() + "2" );

        voit1.seDeplacer(15);

        Voiture voit2 = new Voiture("Mark2", "", 3);

        voit2.seDeplacer(25);
    }

    public static void demoHeritage(){
        Voiture v1 = new Voiture("Mark1", "BipBoup", 3);

        Bateau b1 = new Bateau("Mark2", "okok");
        b1.setNbrVoiles(3);

        Vehicule veh1 = v1;
        Vehicule veh2 = b1;
        veh1 = new Berline();

        Object o = v1;

        if( veh1 instanceof Bateau ) {
            System.out.println("est un bateau");
            b1 = (Bateau) veh1;
        }
        else if (veh1 instanceof Voiture) {
            System.out.println("est une voiture");
            v1 = (Voiture) veh1;
        }
    }

    public static void demoObjectMethods(){


        Voiture v1 = new Voiture("Mark1", "BipBoup", 3);
        Voiture v2 = new Voiture("Mark1", "BipBoup", 5);

        System.out.println( v2.equals( v1 ) ); // true

        Set<Vehicule> vehicules = new HashSet<>();
        vehicules.add( v1 );
        vehicules.add( v2 );

        System.out.println( vehicules.size() ); // 2

        Map<Vehicule, Object> mapVehicules = new HashMap<>();
        mapVehicules.put(v1, new Object());
        mapVehicules.put(v2, new Object());

        System.out.println( mapVehicules.size() ); // 2

        Map<String, Vehicule> map2 = new HashMap<>();
        map2.put("1", v1);
        map2.put("2", v2);

        System.out.println( map2.size() ); // 2 (attention on ne verifie que l'egalité des clefs)

        System.out.println( v1 ); // println utilise le 'toString()' de l'objet

        Object o =v1;
    }

    public static <T extends Vehicule> T getFirstVehicule(List<T> liste){
        return liste.size() > 0 ? liste.getFirst() : null;
    }

    public static <T> void addObjectToList(List<? super T> list, T toAdd){
        list.add(toAdd);
    }


//    public static Vehicule getFirstVehicule(List<Vehicule> liste){
//        return liste.size() > 0 ? liste.getFirst() : null;
//    }
////
//    public static Voiture getFirstVehicule(List<Voiture> liste){
//        return liste.size() > 0 ? liste.getFirst() : null;
//    }
//
//    public static Bateau getFirstVehicule(List<Bateau> liste){
//        return liste.size() > 0 ? liste.getFirst() : null;
//    }

}
