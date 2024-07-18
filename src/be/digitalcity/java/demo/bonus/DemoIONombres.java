package be.digitalcity.java.demo.bonus;

import java.util.Scanner;

public class DemoIONombres {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("check");
        if( sc.hasNextInt()){
            System.out.println("input");
            System.out.printf("> %d \n\n", sc.nextInt());
        }

    }

}
