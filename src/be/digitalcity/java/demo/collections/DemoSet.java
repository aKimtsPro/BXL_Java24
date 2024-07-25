package be.digitalcity.java.demo.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class DemoSet {

    public static void main(String[] args) {

        // Collection non ordonnée, ne permettant pas les doublons, sans accès direct
        HashSet<String> prenoms = new HashSet<>();

        // Ajouter
        prenoms.add("Luc"); // N'ajoute que si aucun autre élément n'est ".equals()"
        prenoms.add("Marie");
        prenoms.add("Marie"); // ne sera pas ajouté

        // Recupérer
        // Impossible sans iterator ou foreach
        for (String prenom : prenoms) {
            System.out.println(prenom);
        }

        // Retirer
        prenoms.remove("Marie"); // via ".equals()"

    }

}
