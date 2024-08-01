package be.digitalcity.java.demo.bonus;

import be.digitalcity.java.demo.oo.Vehicule;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DemoReflection {

    public static void main(String[] args) {

        Class<Vehicule> clazz = Vehicule.class;

        for (Method method : clazz.getMethods()) {
            System.out.println( method.getName() );
        }

        for (Field field : clazz.getFields()) {
            System.out.println( field.getName() );
        }

    }

}
