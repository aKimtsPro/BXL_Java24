package be.digitalcity.java.demo.operateur;

import java.math.BigDecimal;

public class DemoOperateur {

    public static void main(String[] args) {

        // Opérateur arithmétique
        int a = 10, b = 3;
        double rslt;

        rslt = a + b; // 13
        rslt = a - b; // 7
        rslt = a * b; // 30
        rslt = a / b; // 3 => division entière entre 2 entiers
        rslt = a / (double) b; // 3.333... => division réelle avec au - 1 réel
        rslt = a % b; // 1


        System.out.println(rslt);

        rslt = rslt + 1;
        rslt += 1;

        rslt = rslt * 2;
        rslt *= 2;

        rslt = rslt % 10;
        rslt %= 10;

        // Incrémentation/Décrémentation

        int variable = 0;

        System.out.println( variable++ ); // 0      // récup => incr
        System.out.println( ++variable ); // 2      // incr => récup
        System.out.println( variable-- ); // 2      // récup => décr.
        System.out.println( --variable ); // 0      // décr. => récup

        System.out.println(variable); // 0

        // Affectation

        // L'opération d'affectation résulte en la nouvelle valeur
        // de la variable.
        System.out.println( variable = 5 ); // 5
        System.out.println( variable += 5 ); // 10
        System.out.println( variable = variable++ ); // 10
    }

}
