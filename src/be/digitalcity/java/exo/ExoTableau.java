package be.digitalcity.java.exo;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ExoTableau {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rdm = new Random();

        final char  PION = '*',
                    VIDE = '_',
                    PIECE = '$';

        final int   TAILLE_X = 10,
                    TAILLE_Y = 10;

        final int NBR_PIECES = 5;

        // region SETUP PLATEAU
        char[][] plateau = new char[TAILLE_Y][TAILLE_X];
        for (int i = 0; i < TAILLE_Y; i++) {
            Arrays.fill(plateau[i], VIDE);
        }

        int positionX = TAILLE_X / 2,
            positionY = TAILLE_Y / 2;
        plateau[positionY][positionX] = PION;

        // region SETUP PIECE
        int piecePresentes = 0;
        while( piecePresentes < NBR_PIECES ){
            int positionPieceX = rdm.nextInt(TAILLE_X),
                positionPieceY = rdm.nextInt(TAILLE_Y);

            if( plateau[positionPieceY][positionPieceX] == VIDE ){
                plateau[positionPieceY][positionPieceX] = PIECE;
                piecePresentes++;
            }
        }
        // endregion
        // endregion


        // region GAME LOOP
        char commande;
        do {
            // region AFFICHER LE PLATEAU
            StringBuilder sb = new StringBuilder();
            for (int y = 0; y < plateau.length; y++) {
                sb.append('[').append(' ');
                for (int x = 0; x < plateau[y].length; x++) {
                    sb.append(plateau[y][x]);
                    sb.append(' ');
                }
                sb.append(']').append('\n');
            }
            System.out.println(sb.toString());
            // endregion

            // demander la commande (g, d, h, b, q)
            System.out.print("""
                    Direction ou quitter: (g)auche, (d)roite, (h)aut, (b)as, (q)uitter:
                    > """);

            String input = sc.nextLine()
                    .trim();
            commande = input.length() > 1 ? '_' : input.toLowerCase().charAt(0);

            // bouger le pion si pas quitter
            switch (commande){
                case 'g', 'd' -> {
                    plateau[positionY][positionX] = VIDE;

                    if( commande == 'g' )
                        positionX = positionX == 0 ? TAILLE_X-1 : positionX-1;
                    else
                        positionX = positionX == TAILLE_X-1 ? 0 : positionX+1;
                    // region ALTERNATIVE
//                    position_x = commande == 'g' ?
//                            (position_x == 0 ? TAILLE-1 : position_x-1) :
//                            (position_x == TAILLE-1 ? 0 : position_x+1);
                    // endregion

                    if( plateau[positionY][positionX] == PIECE )
                        piecePresentes--;

                    plateau[positionY][positionX] = PION;
                }
                case 'b', 'h' -> {
                    plateau[positionY][positionX] = VIDE;

                    if( commande == 'b' )
                        positionY = positionY == TAILLE_Y-1 ? 0 : positionY+1;
                    else
                        positionY = positionY == 0 ? TAILLE_Y-1 : positionY-1;


                    if( plateau[positionY][positionX] == PIECE )
                        piecePresentes--;

                    plateau[positionY][positionX] = PION;
                }
                case 'q' -> System.out.println("Au revoir");
                default -> System.out.println("Choix invalide");
            }

        } while ( commande != 'q' && piecePresentes > 0 );
        // endregion

        if( piecePresentes == 0 ){
            // region AFFICHER LE PLATEAU
            StringBuilder sb = new StringBuilder();
            for (int y = 0; y < plateau.length; y++) {
                sb.append('[').append(' ');
                for (int x = 0; x < plateau[y].length; x++) {
                    sb.append(plateau[y][x]);
                    sb.append(' ');
                }
                sb.append(']').append('\n');
            }
            System.out.println(sb.toString());
            // endregion
            System.out.println("C'est gagné");
        }

    }

}
