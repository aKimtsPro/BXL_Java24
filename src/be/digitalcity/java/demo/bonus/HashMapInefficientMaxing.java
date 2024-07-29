package be.digitalcity.java.demo.bonus;

import be.digitalcity.java.exo.oo.Personne;

import java.util.HashMap;
import java.util.Map;

public class HashMapInefficientMaxing {

    public static void main(String[] args) {

        class BadClass {
            int hash;

            public BadClass(int hash) {
                this.hash = hash;
            }

            @Override
            public int hashCode() {
                return hash;
            }
        }

        Map<BadClass, Object> test = new HashMap<>(4);

        for (int i = 0; i < 100; i++) {
            test.put(new BadClass(i*4), null);
        }


    }

}
