package lesson5Homework.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask extends RecursiveTask<List<Integer>> {

    private final int[] nums;
    private final int forkJoinSize;
    private final int start;
    private final int end;

    public MyRecursiveTask(int[] nums, int forkJoinSize, int start, int end) {
        this.nums = nums;
        this.forkJoinSize = forkJoinSize;
        this.start = start;
        this.end = end;
    }


    @Override
    protected List<Integer> compute() {

        if (end - start > forkJoinSize) {
            int middle = (start + end) / 2;
            MyRecursiveTask left = new MyRecursiveTask(nums, forkJoinSize, middle, end);
            MyRecursiveTask right = new MyRecursiveTask(nums, forkJoinSize, start, middle);
            invokeAll(left, right);

//            return left.join() + right.join();
            List<Integer> array = new ArrayList<>();
            array.addAll(left.join());
            array.addAll(right.join());
            return array;
        } else {

            List<Integer> list = new ArrayList<>();

            for (int i = start; i < end; i++) {
                if (isPrimeNumber(nums[i])) {
                    list.add(nums[i]);
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            return list;


        }
    }

    public boolean isPrimeNumber(int n) {
        int counter = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                counter++;
            }
        }
        return counter == 2;
    }
}
