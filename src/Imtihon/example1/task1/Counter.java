package Imtihon.example1.task1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Counter {

    public static int count;

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Runnable runnable = () -> add();

        for (int i = 0; i < 10000; i++) {

            executorService.submit(runnable);

//            System.out.println(count);

        }


        executorService.shutdown();


        while (!executorService.isTerminated()) {

        }

        System.err.println(count);


    }

    public  static synchronized void add() {

            count++;

    }


}
