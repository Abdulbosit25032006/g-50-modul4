package lesson5Homework.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {

        int[] nums = new int[40_000];

        Random random = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(50);
        }
        System.out.println("Array full");

        long begin = System.currentTimeMillis();
        MyRecursiveTask myRecursiveTask = new MyRecursiveTask(nums,200,0,nums.length);
        List<Integer> compute = myRecursiveTask.compute();
        System.out.println(compute);
        System.out.println("compute.size() = " + compute.size());
        long end = System.currentTimeMillis();
        System.out.println("Time -> " + (end - begin));

        recursive(nums);
    }

    private static void recursive(int[] nums){
        long begin = System.currentTimeMillis();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 5 == 0){
                list.add(nums[i]);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        System.out.println(list);
        System.out.println("list.size() = " + list.size());
        long end = System.currentTimeMillis();
        System.out.println("Time -> " + (end - begin));
    }

}
