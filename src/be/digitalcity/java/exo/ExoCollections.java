package be.digitalcity.java.exo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class ExoCollections {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> notes = new LinkedList<>();

        boolean quit = false;
        while( !quit ){
            System.out.print("Nombre ou (q)uitter > ");

            if( sc.hasNextInt() ){
                int value = sc.nextInt();
                if( value < 0 || value > 20 )
                    System.out.println("note invalide");
                else{
                    notes.add(value);
                }
            }
            else {
                String value = sc.next();
                if( value.trim().equalsIgnoreCase("q") ){
                    System.out.println("Au revoir");
                    quit = true;
                }
                else {
                    System.out.println("Invalide");
                }
            }
        }

        System.out.println(notes);

        double total = 0;
        for (int note : notes) {
            total += note;
        }

        System.out.printf( "MOYENNE: %.2f\n", (total/notes.size()) );


    }

}
