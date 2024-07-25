package be.digitalcity.java.demo.collections;

import java.util.HashMap;

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




    }

}
