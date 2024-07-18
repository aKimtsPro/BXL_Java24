package be.digitalcity.java.demo.operateur;

import java.util.Scanner;

public class DemoComparaison {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in); // adr02
        Scanner sc2 = new Scanner(System.in); // adr75
        Scanner sc3 = sc1; // adr02

        int a = 5, b = 5;
        boolean rslt;

        // Pour tout
        rslt = a == b; // false
        rslt = a != b; // true

        // Uniquement avec des nombres
        rslt = a < b; // false
        rslt = a > b; // true
        rslt = a <= b; // false
        rslt = a >= b; // true



        // Attention à l'égalité entre objet:
        rslt = sc1 == sc2; // false : pas le même objet => pas la même ref
        rslt = sc1 == sc3; // true  : même objet        => même ref

//        rslt = sc1 > sc3; // impossible, uniquement avec des nombres

        String str1 = "salut";
        String str2 = "salut";
        String str3 = new String("salut");
        String str4 = "sa" + "lut";

        rslt = str1 == str2; // true
        rslt = str1 == str3; // false
        rslt = str1 == str4; // true

    }

}
