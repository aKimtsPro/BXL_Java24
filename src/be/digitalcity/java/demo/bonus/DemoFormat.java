package be.digitalcity.java.demo.bonus;

import java.util.Random;
import java.util.Scanner;

public class DemoFormat {

    public static void main(String[] args) {

        String formatted = "voici un nombre: %d, voici une String: %s, voici: un Objet: %s".formatted(12, "salut", new Random());


        System.out.printf("%d, %s, %s", 1, "v", new Random());


        // Majuscules/Minuscules:
        String a = "a";
        String b = "A";

        boolean rslt = b.toLowerCase().equals(a); // true
    }

}
