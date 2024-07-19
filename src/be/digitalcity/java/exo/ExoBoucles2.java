package be.digitalcity.java.exo;

import java.util.Scanner;

public class ExoBoucles2 {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        Scanner sc = new Scanner(System.in);
        System.out.println("Combien de nombre premiers?");
        int nbrATrouver = sc.nextInt();
        int nbrTrouve = 0;
        int candidat = 2;

        while (nbrTrouve < nbrATrouver){
            // verifier si candidat est permier
            boolean estPremier = true;

            for (int i = 2;estPremier && i*i <= candidat; i++) {
                if (candidat % i == 0) {
                    estPremier = false;
                }
            }

            if (estPremier) {
                System.out.println(candidat + " est premier");
                nbrTrouve++;
            }

            candidat++;
        }

        long end = System.currentTimeMillis(); // 4s


        System.out.printf("Execution time: %dms\n", end-start);

    }

}

//


