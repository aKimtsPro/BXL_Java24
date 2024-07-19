package be.digitalcity.java.demo.tableau;

import java.util.Arrays;

public class DemoTableau {

    public static void main(String[] args) {


        // Création de tableau
        int[] tab = new int[3];
        tab = new int[]{ 1, 2, 3, 4, 5 };
        int[] tab2 = { 1, 2, 3, 4, 5 };

        System.out.print("[ ");
        for (int i = 0; i < tab.length ; i++) {
            System.out.print( tab[i]+ ", " );
        }
        System.out.print(" ]");

        Arrays.toString(tab);

        int[] tab3 = {1,2};

        System.out.println( tab[0] ); // 0
        // entre les index 0 et 9 (taille - 1): OK, sinon: KO
//        System.out.println( tab[0] == null ? "null" : "pas null" );
// impossible de mettre null dans int

        tab[0] = 5;

//        tab[9999] = 1; // erreur

        // Récupérer la taille du tableau:
        System.out.println( tab.length );


        // Ex: les notes des éléves de chaque classes (1dim pour la classe, 1dim pour les notes)
        int[][] tab2Dim = new int[3][];
        tab2Dim[0] = new int[6];
        tab2Dim[1] = new int[2];
        tab2Dim[2] = new int[18];

        // Ex: Une image
        int[][] matrice = new int[4][4]; // Les sous-tableaux ont tous la même taille

        for (int index1Dim = 0; index1Dim < matrice.length; index1Dim++) {

            for (int index2Dim = 0; index2Dim < matrice[index1Dim].length ; index2Dim++) {
                System.out.print( matrice[index1Dim][index2Dim] + " " );
            }
            System.out.println();

        }

    }

}
