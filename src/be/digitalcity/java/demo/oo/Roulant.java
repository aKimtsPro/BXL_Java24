package be.digitalcity.java.demo.oo;

public interface Roulant {

    default void rouler(int distance) {
        System.out.println("ca roule");
    }

}
