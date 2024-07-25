package be.digitalcity.java.demo.bonus;

import java.util.StringJoiner;

public class DemoStringJoiner {

    public static void main(String[] args) {
        StringJoiner sb = new StringJoiner(" ", "<", ">");

        sb.add("machin").add("bidule").add("truc");
        System.out.println( sb.toString() );
    }

}
