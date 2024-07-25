package be.digitalcity.java;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

//        String rslt = "";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 500_000_000; i++) {
//            rslt += 'a';
            sb.append('a');
        }

        String rslt = sb.toString();

        long end = System.currentTimeMillis();

        System.out.printf("%dms\n", end - start);


    }

}
