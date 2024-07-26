package be.digitalcity.java.demo.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoList {


    public static void main(String[] args) {

        // Une liste est une Collection ordonnée, avec doublon et accès direct (via index)
        ArrayList<String> prenoms = new ArrayList<>(100);

        // Ajouter des éléments
        prenoms.add("Luc"); // à la position 0
        prenoms.add("Marie"); // à la position 1
        prenoms.add(1, "Dominique"); // à la position 1, décalage des éléments suivants

        // Récupérer des éléments
        String element = prenoms.get(2); // Marie
        String premier = prenoms.getFirst(); // Luc
        String dernier = prenoms.getLast(); // Marie

        int position = prenoms.indexOf("Dominique"); // 1
        position = prenoms.lastIndexOf("Dominique"); // 1

        int[] tab = new int[5];

        for (String prenom : prenoms) {
            System.out.println(prenom);
        }


        // Supprimer des éléments
        prenoms.clear(); // vide la liste
        prenoms.remove(0);
        prenoms.remove("Luc");
        prenoms.removeAll( List.of("Marie", "Dominique") );

        System.out.println( "taille: %d".formatted(prenoms.size()) );

        LinkedList<String> listeChainee = new LinkedList<>();
    }

}
