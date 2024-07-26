package be.digitalcity.java.demo.collections;

import java.text.DecimalFormat;
import java.util.*;

public class DemoMap {

    public static void main(String[] args) {

        HashMap<String, int[]> notesParClasse = new HashMap<>();

        // Ajouter ou Remplacer
        notesParClasse.put( "A1", new int[]{1,2,3} );
        if( notesParClasse.containsKey("C4") ){
            // remplacement
            notesParClasse.put( "C4", new int[]{20} );
        }
        else {
            // ajout
            notesParClasse.put( "C4", new int[]{10,2,0,5} );
        }

        // Recupérer
        String clef = "A1";
        int[] valeur = notesParClasse.get(clef);

        Collection<int[]> valeurs = notesParClasse.values();
        Set<String> clefs = notesParClasse.keySet();
        Set<Map.Entry<String, int[]>> entrySet = notesParClasse.entrySet();


        for (String key : notesParClasse.keySet()) {
            System.out.println( key + " -> " + Arrays.toString( notesParClasse.get(key) ));
        }

        for (Map.Entry<String, int[]> entry : notesParClasse.entrySet()) {
            System.out.println( entry.getKey() + " -> " + Arrays.toString( entry.getValue() ));
        }




    }

}
