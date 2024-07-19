package be.digitalcity.java.exo;

import java.util.Scanner;

public class ExoBoucles {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean continuer;
        do {
            // recup données
            System.out.print("> nombre: ");
            int a = sc.nextInt();

            System.out.print("> operateur (+,-,*,/,%): ");
            String op = sc.next();

            System.out.print("> nombre: ");
            int b = sc.nextInt();

            // calcul
            switch (op){
                case "+":
                    System.out.printf("%d + %d = %d\n",a,b,a+b);
                    break;

                case "-":
                    System.out.printf("%d - %d = %d\n",a,b,a-b);
                    break;

                case "*":
                    System.out.printf("%d * %d = %d\n",a,b,a*b);
                    break;

                case "/":
                    if( b == 0 ){
                        System.out.println("division par 0 impossible");
                    }
                    else {
                        System.out.printf("%d / %d = %d\n",a,b,a/b);
                    }
                    break;

                case "%":
                    if( b == 0 ){
                        System.out.println("modulo par 0 impossible");
                    }
                    else {
                        System.out.printf("%d %% %d = %d\n",a,b,a%b);
                    }
                    break;

                default:
                    System.out.println("opérateur invalide");
            }

            // demande continuer
            System.out.println("Continuer? y/n");
            continuer = sc.next().equals("y");

        } while ( continuer );

    }

}
