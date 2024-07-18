package be.digitalcity.java.exo;

import java.util.Scanner;

public class ExerciceConditionnelle {

    public static void main(String[] args) {

        int stockEau = 5;
        int stockThe = 3;
        int stockCafe = 0;

        final int CHOIX_EAU = 1;
        final int CHOIX_THE = 2;
        final int CHOIX_CAFE = 3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Quelle boisson voulez-vous? (1: eau, 2: the, 3: cafe)");
        int choix = sc.nextInt();

        switch ( choix ){
            case CHOIX_EAU:
                if( stockEau > 0 ){
                    System.out.println("Voici votre eau. Il en reste : " + (--stockEau));
                }
                else {
                    System.out.println("Il n'y a plus d'eau");
                }
                break;
            case CHOIX_THE:
                if( stockThe > 0 ){
                    System.out.println("Voici votre thé. Il en reste : " + (--stockThe));
                }
                else {
                    System.out.println("Il n'y a plus de thé");
                }
                break;
            case CHOIX_CAFE:
                if( stockCafe > 0 ){
                    System.out.println("Voici votre café. Il en reste : " + (--stockCafe));
                }
                else {
                    System.out.println("Il n'y a plus de café");
                }
                break;
            default:
                System.out.println("Choix invalide");
        }


    }
}
