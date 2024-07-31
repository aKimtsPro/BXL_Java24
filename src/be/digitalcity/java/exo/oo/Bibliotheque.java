package be.digitalcity.java.exo.oo;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {

    private String nom;
    private final List<Livre> livres = new ArrayList<>();

    Bibliotheque(String nom) {
        this.nom = nom;
    }

    void ajouter(Livre livre ){
        if( livre != null )
            livres.add(livre);
    }

    Livre chercherParTitre(String titre){
        for (Livre livre : livres) {
            if( livre.titre.equals( titre ))
                livres.remove(livre);
        }
        return null;
    }

    void retirer( Livre livre ){
        livres.remove( livre );
    }

    void retirerParNom( String titre ){
        Livre livre = this.chercherParTitre( titre );
        if( livre != null )
            this.retirer(livre);
    }

    public List<Livre> getLivres() {
        return List.copyOf(livres);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
