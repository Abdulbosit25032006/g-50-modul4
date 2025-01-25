package lesson5Homework.task1;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.RecursiveTask;

public class Test {
    public static void main(String[] args) {

        int[] nums = new int[40_000];

        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(10);
        }

        System.out.println("Arrays full");

        long begin = System.currentTimeMillis();
        MyRecursiveTask recursiveTask = new MyRecursiveTask(nums, 200, 0, nums.length);
        List<Integer> compute = recursiveTask.compute();
        System.out.println(compute);
        System.out.println("compute.size() = " + compute.size());


        long end = System.currentTimeMillis();
        System.out.println("->" + (end - begin));


        recursiveTask1(nums);

    }

    public static void recursiveTask1(int[] nums) {

        int counter = 0;
        long begin = System.currentTimeMillis();
        for (int i = 0; i < nums.length; i++) {
            if (isPrimeNumber(nums[i])) {
                counter++;
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        long end = System.currentTimeMillis();

        System.out.println(counter);
        System.out.println("-> " + (end - begin));
    }


    public static boolean isPrimeNumber(int n) {
        int counter = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                counter++;
            }
        }
        return counter == 2;
    }
}
