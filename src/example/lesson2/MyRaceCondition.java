package example.lesson2;

public class MyRaceCondition {

    private static Object object = new Object();

    private static int count = 0;

    public static void main(String[] args) {


        for (int i = 0; i < 100000; i++) {
            Thread thread = new Thread(() -> sum());
            thread.start();
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.err.println(count);

    }

    private static void sum() {
        synchronized (object) {
            count = count + 1;
            System.out.println("navbatdagi tartib raqam " + count);
        }
    }


}

