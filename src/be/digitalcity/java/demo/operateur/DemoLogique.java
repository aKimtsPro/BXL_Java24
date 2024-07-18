package be.digitalcity.java.demo.operateur;

public class DemoLogique {

    public static void main(String[] args) {


        // AND - &&
        System.out.println( true && true );   // true
        System.out.println( true && false );  // false
        System.out.println( false && true );  // false
        System.out.println( false && false ); // false

        // OR - ||
        System.out.println( true || true );   // true
        System.out.println( true || false );  // true
        System.out.println( false || true );  // true
        System.out.println( false || false ); // false

        // NOT - !
        System.out.println( !true );          // false
        System.out.println( !false );         // true

        // XOR - ^
        System.out.println( true ^ true );    // false
        System.out.println( true ^ false );   // true
        System.out.println( false ^ true );   // true
        System.out.println( false ^ false );  // false

        // exemple:
        boolean estLigne = true, estBleu = false;
        System.out.println(  (estBleu && !estLigne) || (!estBleu && estLigne) );
        System.out.println(  estBleu ^ estLigne );


        // Loi de De Morgan


        boolean a = true, b = false;

        boolean c;
        c = !(a && b);
        // peut être transformé en:
        c = !a || !b;

        c = !( a || b );
        // peut être transformé en:
        c = !a && ! b;



        System.out.println( !(estBleu && estLigne) );
        // le sac n'est pas bleu et ligné (en mm temps)
        System.out.println( !estBleu || !estLigne );
        // le sac n'est pas bleu ou pas ligné

        System.out.println( !(estBleu || estLigne) );
        // le sac n'est ni bleu ni ligné
        System.out.println( !estBleu && !estLigne );
        // le sac n'est ni bleu ni ligné

        int temp = 18;
        boolean allumer = temp >= 5 && temp <= 15;
//        boolean fermer = !(temp >= 5 && temp <= 15);
//        boolean fermer = !(temp >= 5) || !(temp <= 15);
        boolean fermer = temp < 5 || temp > 15;


        // opérateur ternaire
        // <condition> ? <valeur si vrai> : <valeur si faux>
        int age = 31;
        String majorite = age >= 18 ? "majeur" : "mineur";

    }

}
