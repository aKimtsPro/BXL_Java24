package be.digitalcity.java.exo;

import java.util.Scanner;

public class ExoOperateur {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer une qtt de secondes: ");
        int inputSec = sc.nextInt();

        // region VERSION 1
//        int minutes = inputSec / 60;
//        int secondes = inputSec % 60;
//
//        int heures = minutes / 60;
//        minutes %= 60;
//
//        int jours = heures / 24;
//        heures %= 24;
        // endregion

        // region VERSION 2
        int jours = inputSec / 86_400;
        inputSec %= 86_400;

        int heures = inputSec / 3_600;
        inputSec %= 3_600;

        int minutes = inputSec / 60;
        int secondes = inputSec % 60;
        // endregion

        System.out.println(jours+" j");
        System.out.println(heures+" h");
        System.out.println(minutes+" m");
        System.out.println(secondes+" s");
    }

}
