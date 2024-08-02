package be.digitalcity.java.exo.oo.competition;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Competition<Nageur> competN = new Competition<>();

        Nageur n1 = new Nageur("","", LocalDate.EPOCH , 3);
        Nageur n2 = new Nageur("","", LocalDate.EPOCH , 2);
        Nageur n3 = new Nageur("","", LocalDate.EPOCH , 4);
        Nageur n4 = new Nageur("","", LocalDate.EPOCH , 5);

        competN.signUp(n1,n2,n3,n4);

        Competition<Coureur> competC = new Competition<>();

    }
}
