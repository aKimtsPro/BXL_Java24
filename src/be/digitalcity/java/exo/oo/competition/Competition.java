package be.digitalcity.java.exo.oo.competition;

import java.util.HashSet;
import java.util.Set;

public class Competition {

    final int minParticipant;
    final int maxParticipant;
    boolean started;
    final Set<Personne> participants = new HashSet<>();

    Competition(int minParticipant, int maxParticipant){
        this.maxParticipant = maxParticipant;
        this.minParticipant = minParticipant;
    }

    Competition(){
        this(3, 12);
    }

    Competition(int maxParticipant){
        this(3, maxParticipant);
    }

}
