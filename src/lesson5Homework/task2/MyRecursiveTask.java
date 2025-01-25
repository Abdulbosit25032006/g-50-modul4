package lesson5Homework.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask extends RecursiveTask<List<Integer>> {
    private int[] nums;
    private int forkJoinSize;
    private int start;
    private int end;

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
            MyRecursiveTask left = new MyRecursiveTask(nums,forkJoinSize,start,middle);
            MyRecursiveTask right = new MyRecursiveTask(nums,forkJoinSize,middle,end);
            invokeAll(left,right);

            List<Integer> integerList = new ArrayList<>();
            integerList.addAll(left.join());
            integerList.addAll(right.join());

            return integerList;


        } else {
            List<Integer> list = new ArrayList<>();
            for (int i = start; i < end; i++) {
                if (nums[i] % 5 == 0){
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
}
