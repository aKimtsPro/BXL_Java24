package be.digitalcity.java.demo.boucles;

import java.util.Iterator;
import java.util.Set;

public class DemoForEach {

    public static void main(String[] args) {

        Set<String> set = Set.of("bidule", "bazar", "machin");


        for (String s : set) {
            System.out.println(s);
        }

        // Code réel derrière pour les Iterable
        for (Iterator<String> iter = set.iterator(); iter.hasNext() ; ) {
            String s = iter.next();
            System.out.println(s);
        }

        String[] table = { "bidule", "bazar", "machin" };

        for (String s : table) {
            System.out.println(s);
        }

        // Code réel derrière pour les tableaux
        for (int i = 0; i < table.length; i++) {
            String s = table[i];
            System.out.println(s);
        }

    }

}
