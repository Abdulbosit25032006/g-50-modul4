package lesson4Homework.task1;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterService {


    public static void main(String[] args) {


        executorServiceFixed();

//        execuroServiseSingle();


    }

    private static void execuroServiseSingle() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Long begin = System.currentTimeMillis();


        for (int i = 0; i < 100; i++) {
            executorService.submit(() -> {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(new Date());
            });

        }

        long end = System.currentTimeMillis();
        executorService.shutdown();

        System.out.println(end - begin);
    }

    private static void executorServiceFixed() {
        Long begin = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(10);


        for (int i = 0; i < 100; i++) {
            executorService.submit(() -> {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(new Date());
            });

        }

        long end = System.currentTimeMillis();
        executorService.shutdown();

        System.out.println(end - begin);
    }
}
