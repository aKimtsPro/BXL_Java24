package be.digitalcity.java;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String a = new Scanner(System.in).nextLine();
        System.out.println(Objects.equals(a, "a") ? "egal" : "pas egal" );
    }

}
