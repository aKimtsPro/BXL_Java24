package be.digitalcity.java.demo.bonus;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class StringComparaison {

    public static void main(String[] args) {
        testConcat();
        testFormat();
        testBuilder();
        testBuffer();

        testBuilderThreads();
        testBufferThreads();
    }

    public static void testConcat(){
        long start = System.currentTimeMillis();
        String s = "";
        for(int i = 0; i < 300_000; i++){
            s += "A";
        }
        long end = System.currentTimeMillis();
        System.out.println("Concatenation = " + ((end - start)) + " millisecond") ;
    }

    public static void testFormat(){
        long start = System.currentTimeMillis();
        String s = "";
        for(int i = 0; i < 300_000; i++){
            s = String.format("%s%s",s, "A");
        }
        long end = System.currentTimeMillis();
        System.out.println("Format = " + ((end - start)) + " millisecond");
    }


    @SuppressWarnings("all")
    public static void testBuffer(){
        long start = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer();
        for(int i = 0; i < 3_000_000; i++){
            buffer.append("A");
        }
        long end = System.currentTimeMillis();

        System.out.println("Buffer = " + ((end - start)) + " millisecond") ;
    }

    @SuppressWarnings("all")
    public static void testBuilder(){
        long start = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < 3_000_000; i++){
            builder.append("A");
        }
        long end = System.currentTimeMillis();

        System.out.println("Builder = " + ((end - start)) + " millisecond") ;
    }

    @SuppressWarnings("all")
    public static void testBufferThreads(){
        StringBuffer buffer = new StringBuffer();

        try( ForkJoinPool pool =  new ForkJoinPool(3) ){

            Runnable runnable = () -> {
                for(int i = 0; i < 1_000_000; i++){
                    buffer.append("A");
                }
            };

            ForkJoinTask<?> task1 = ForkJoinTask.adapt( runnable );
            ForkJoinTask<?> task2 = ForkJoinTask.adapt( runnable );
            ForkJoinTask<?> task3 = ForkJoinTask.adapt( runnable );

            pool.execute( task1 );
            pool.execute( task2 );
            pool.execute( task3 );

            task1.join();
            task2.join();
            task3.join();

            System.out.println("Size after operations on StringBuffer = " + buffer.length() ); // Expected 3_000_000
        }
    }

    // On remarque des problèmes dans le résultat
    @SuppressWarnings("all")
    public static void testBuilderThreads(){
        StringBuilder builder = new StringBuilder();

        try( ForkJoinPool pool =  new ForkJoinPool(3) ){

            Runnable runnable = () -> {
                for(int i = 0; i < 1_000_000; i++){
                    builder.append("A");
                }
            };

            ForkJoinTask<?> task1 = ForkJoinTask.adapt( runnable );
            ForkJoinTask<?> task2 = ForkJoinTask.adapt( runnable );
            ForkJoinTask<?> task3 = ForkJoinTask.adapt( runnable );

            pool.execute( task1 );
            pool.execute( task2 );
            pool.execute( task3 );

            task1.join();
            task2.join();
            task3.join();

            System.out.println("Size after operations on StringBuilder = " + builder.length() ); // Expected 3_000_000
        }
    }




}
