package be.digitalcity.java.demo.boucles;

import java.util.Random;
import java.util.Scanner;

public class DemoBoucles {

    public static void main(String[] args) {

        Random randomizer = new Random();
        int rdmNumber;
        while ( (rdmNumber = randomizer.nextInt(1, 11)) != 5){
            System.out.println(rdmNumber);
        }

        int oeufs = 3;
        while( oeufs > 0 ){
            System.out.println("Je lance un oeuf");
            oeufs--;
        }

        // for( decl/affectation d'une variabe; condition ; action de fin d'itération){ instructions; }
        int nbrOeufs;
        for( nbrOeufs = 3; nbrOeufs > 0 ; nbrOeufs-- ){
            System.out.println("Je lance un oeuf");
        }
        System.out.println(nbrOeufs);

        // Ecrire les puissances de 2 inférieures à 1000
        for(int i = 1; (i *= 2) < 1000 ; System.out.println(i));

        // Fait exactement pareil que:
        int i = 1;
        while((i *= 2) < 1000){
            System.out.println(i);
        }


        Scanner sc = new Scanner(System.in);
        int choix;

        // Quand la condition dépend de l'itération => do ... while
        // donne une itération "gratuite"

        boolean invalidChoice;

        // continuer: choix < 1 || choix > 3
        // arret: choix >= 1 && choix <= 3
        do {

            System.out.println("Quelle boisson voulez-vous? (1: eau, 2: the, 3: cafe)");
            choix = sc.nextInt();

            invalidChoice = choix < 1 || choix > 3;
            if( invalidChoice ) {
                System.out.println("Choix invalide rééssayez");
            }

        } while ( invalidChoice );



    }

}
