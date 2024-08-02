package be.digitalcity.java.demo.oo;

public class Personne {

    private String prenom;
    private String nom;

    public Personne(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    // Personne.saluer(Personne,String)
    public void saluer(Personne p, String salutation){
        System.out.printf("%s %s %s\n", salutation, p.prenom, p.nom);
    }

    // Personne.saluer(String,Personne)
    public void saluer(String salutation, Personne p){
        System.out.printf(
                "%s %s %s, je suis %s %s\n",
                salutation,
                p.prenom,
                p.nom,
                prenom,
                nom
        );
    }



    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
