package be.digitalcity.java.exo.oo.competition;

import java.util.HashSet;
import java.util.Set;

public class Competition<C extends Competiteur> {

    public static final int DEFAULT_MIN_PARTICIPANT = 3;
    public static final int DEFAULT_MAX_PARTICIPANT = 12;

    private final int minParticipant;
    private final int maxParticipant;
    private boolean started;
    private final Set<C> participants = new HashSet<>();

    public Competition(int minParticipant, int maxParticipant){
        this.maxParticipant = maxParticipant;
        this.minParticipant = minParticipant;
    }

    public Competition(){
        this(DEFAULT_MIN_PARTICIPANT, DEFAULT_MAX_PARTICIPANT);
    }

    public Competition(int maxParticipant){
        this(DEFAULT_MIN_PARTICIPANT, maxParticipant);
    }

    public void signUp(C toSignUp ){
        if( participants.size() < maxParticipant && !started  ){
            participants.add( toSignUp );
        }
    }

    public void signUp( C ...signUps ){
        for (C toSignUp : signUps) {
            signUp(toSignUp);
        }
    }

    public void remove( C toRemove ){
        if( toRemove != null && !started ){
            participants.remove(toRemove);
        }
    }

    public void start(){
        if( !started )
            started = true;
    }

    public int getMinParticipant() {
        return minParticipant;
    }

    public int getMaxParticipant() {
        return maxParticipant;
    }

    public boolean isStarted() {
        return started;
    }

    private void setStarted(boolean started) {
        this.started = started;
    }

    public Set<C> getParticipants() {
        return Set.copyOf(participants);
    }
}
