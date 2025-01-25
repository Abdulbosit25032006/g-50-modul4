package lesson4Homework.task2;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CachedPool {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();

        Long begin = System.currentTimeMillis();


        for (int i = 0; i < 100; i++) {
            executorService.execute(() -> {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
//                System.out.println(new Date());
            });

        }


        try {
            executorService.shutdown();
            executorService.awaitTermination(1, TimeUnit.SECONDS);
            long end = System.currentTimeMillis();
            System.out.println(end - begin);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
