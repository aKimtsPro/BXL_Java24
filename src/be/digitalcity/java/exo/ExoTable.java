package be.digitalcity.java.exo;

import java.util.HashMap;
import java.util.Scanner;

public class ExoTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> panier = new HashMap<>();
        HashMap<Character, String> possiblite = new HashMap<>();
        possiblite.put('C', "Carotte");
        possiblite.put('T', "Tomate");
        possiblite.put('Z', "Zucchini");

        char input;
        do {
            // region ITERATION
            // region AFFICHAGE MENU
            System.out.println("Menu des produits: \n");
            for (char key : possiblite.keySet()) {
                String value = possiblite.get(key);
                System.out.printf("%s -> %s\n", key, value);
            }
            System.out.printf("Q -> Quitter\n");
            // endregion

            input = sc.nextLine().trim()
                    .toUpperCase()
                    .charAt(0);

            if( input == 'Q' ){
                System.out.println("Au revoir");
            }
            else if ( possiblite.containsKey(input) ){

                String legume = possiblite.get(input);

                if( panier.containsKey(legume) ){
                    int currentQtt = panier.get(legume);
                    panier.put(legume, currentQtt + 1);
                }
                else {
                    panier.put(legume, 1);
                }

            }
            else {
                System.out.println("Invalide");
            }
            // endregion
        } while( input != 'Q' );

        System.out.println("MON PANIER: ");
        for (String key : panier.keySet()) {
            int value = panier.get(key);
            System.out.printf("%s -> %s\n", key, value);
        }

    }

}
