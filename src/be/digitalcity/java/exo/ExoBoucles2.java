package be.digitalcity.java.exo;

import java.util.Arrays;
import java.util.Scanner;

public class ExoBoucles2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Combien de nombre premiers?");
        int nbrATrouver = sc.nextInt();
        long start = System.currentTimeMillis();
        int nbrTrouve = 0;
        int candidat = 2;

        int[] premiers = new int[nbrATrouver];

        while (nbrTrouve < nbrATrouver){
            // verifier si candidat est permier
            boolean estPremier = true;

            for (int i = 0;estPremier && i < nbrTrouve && premiers[i] * premiers[i] <= candidat; i++) {
                int diviseur = premiers[i];
                if( candidat % diviseur == 0 )
                    estPremier = false;
            }

            if (estPremier) {
                premiers[ nbrTrouve ] = candidat;
                nbrTrouve++;
            }

            candidat++;
        }

        System.out.println( Arrays.toString(premiers) );

        long end = System.currentTimeMillis(); // 4s

        System.out.printf("Execution time: %dms\n", end-start);

    }

}

//


