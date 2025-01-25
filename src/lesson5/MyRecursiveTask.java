package lesson5;

import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask extends RecursiveTask<Integer> {

    private final int[] nums;
    private final int minimumForkSize;
    private final int start;
    private final int end;

    public MyRecursiveTask(int[] nums, int minimumForkSize, int start, int end) {
        this.nums = nums;
        this.minimumForkSize = minimumForkSize;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {

        if (end - start > minimumForkSize) {
            int middle = (start + end) / 2;
            MyRecursiveTask left = new MyRecursiveTask(nums, minimumForkSize, start, middle);
            MyRecursiveTask right = new MyRecursiveTask(nums, minimumForkSize, middle, start);
            invokeAll(left, right);

            return left.join() + right.join();
        }else {
            int counter = 0;
            int sum=0;
            for (int i = start; i < end; i++) {
                if (nums[i] % 2 == 0){
                    sum+= nums[i];
                    counter++;
                }
            }
            return counter;
        }

    }
}
