package be.digitalcity.java.exo;

import java.util.Scanner;

public class ExoInOut {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer votre nom: ");
        String nom = sc.nextLine();

        System.out.println("Veuillez entrer votre age: ");
//        int age = Integer.parseInt( sc.nextLine() );
        int age = sc.nextInt();

        System.out.println("Bonjour " + nom + ", dans 20 ans, vous aurez " + (age + 20) + "ans." );

    }

}
