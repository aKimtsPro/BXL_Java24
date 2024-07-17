package be.digitalcity.java.demo.variable;

import java.util.Scanner;

public class DemoInOut {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer un mot: ");
        String input = sc.nextLine();

        System.out.println("Votre mot: " + input);

//        Veuillez entrer un mot:
//        mot
//        Votre mot: mot
    }

}
