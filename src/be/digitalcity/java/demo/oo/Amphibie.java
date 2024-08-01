package be.digitalcity.java.demo.oo;

public interface Amphibie extends Roulant, Navigable {

    /*public final static*/ int DEFAULT_DISTANCE = 10;

    boolean getMode();
    void setMode(boolean modeAquatique);

}
