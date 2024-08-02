package be.digitalcity.java.demo.bonus;

import be.digitalcity.java.demo.oo.Vehicule;
import be.digitalcity.java.demo.oo.Voiture;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DemoReflection {

    public static void main(String[] args) {

        Vehicule vehicule = new Voiture("","",1);
        Class<Vehicule> clazz = Vehicule.class;
        Class<? extends Vehicule> clazz2 = vehicule.getClass();

        for (Method method : clazz.getMethods()) {
            System.out.println( method.getName() );
        }

        for (Field field : clazz.getFields()) {
            System.out.println( field.getName() );
        }

    }

}
