package lesson5;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinPoolTest {
    public static void main(String[] args) {


        long begin = System.currentTimeMillis();
        Random random = new Random();
        int[] array = new int[400_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        System.out.println("Arrays full");



        ForkJoinPool forkJoinPool = new ForkJoinPool();
        MyRecursiveTask recursiveTask = new MyRecursiveTask(array,100,0,array.length);
        Integer invoke = forkJoinPool.invoke(recursiveTask);
        System.out.printf("Invoke : %s Time : %s",invoke , System.currentTimeMillis() - begin);

    }
}
