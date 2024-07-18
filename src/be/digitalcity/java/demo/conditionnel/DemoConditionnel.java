package be.digitalcity.java.demo.conditionnel;

import java.util.Scanner;

public class DemoConditionnel {

    public static void main(String[] args) {


        int temp = 18;

        if ( temp >= 5 && temp <= 15 ) {
            System.out.println("J'allume la chaudière");
        }
        else if( temp < 5 ){
            System.out.println("J'allume le poele");
        }
        else {
            System.out.println("J'éteind la chaudière");
        }


        int age = 58;
        if( age < 0 ){
            System.out.println("Age invalide");
        }
        else if ( age < 12 ){
            System.out.println("Enfant");
        }
        else if ( age < 18 ){
            System.out.println("Adolescent");
        }
        else if ( age < 67 ){
            System.out.println("Adulte");
        }
        else {
            System.out.println("Retraité");
        }

        age = 18;
        switch ( age ){
            case 0:
                System.out.println("Vous êtes né");
                break;
            case 13:
                System.out.println("adolescence tardive");
            case 12:
                System.out.println("C'est le début de l'adolescence");
                break;
            case 18:
                System.out.println("Vous devenez adulte");
                break;
            case 67:
                System.out.println("C'est la retraite");
                break;
            default:
                System.out.println("Rien de particulier");
        }



        // depuis Java 13
        int jourChiffre = 5;
        String jour = switch( jourChiffre ){
            case 1: yield "lundi";
            case 2: yield "mardi";
            case 3: yield "mercredi";
            case 4: yield "jeudi";
            case 5: yield "vendredi";
            case 6: yield "samedi";
            case 7: yield "dimanche";
            default: yield "pas un jour";
        };

        // Depuis Java 12
        jour = switch (jourChiffre){
            case 1 -> "lundi";
            case 2 -> "mardi";
            case 3,57 -> {
                System.out.println("code supplémentaire");
                yield "mercredi";
            }
            case 4 -> "jeudi";
            case 5 -> "vendredi";
            case 6 -> "samedi";
            case 7 -> "dimanche";
            default -> "pas un jour";
        };

        // Depuis Java 17 : Pattern Matching
        Object valeur = 5;

        switch (valeur){
            case null -> System.out.println("C'est null");
            case Integer i -> System.out.println("C'est un entier");
            case String s -> System.out.println("C'est une String");
            case Scanner sc -> System.out.println("C'est un Scanner");
            default -> System.out.println("Aucun de ces types");
        }


    }

}
