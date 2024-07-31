package be.digitalcity.java.exo.oo.banque;

import java.time.LocalDateTime;

public class Epargne extends Compte {

    private LocalDateTime dateDernierRetrait;

    public Epargne(String numero, Personne titulaire){
        super( numero, titulaire );
    }

    // region GET/SET
    public LocalDateTime getDateDernierRetrait() {
        return dateDernierRetrait;
    }

    private void setDateDernierRetrait(LocalDateTime dateDernierRetrait) {
        this.dateDernierRetrait = dateDernierRetrait;
    }
    // endregion

    //region METHODS



    // endregion
}
