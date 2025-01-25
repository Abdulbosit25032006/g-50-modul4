package example.lesson3;

public class MyFieldVisibility {
    /// field visibility problem
    public static boolean condition = true;

    /// field visibility no problem
//    public static volatile boolean condition = true;
    public static void main(String[] args) {

        new Thread(() -> {
            while (condition) {
            }
        }).start();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        condition = false;
        System.out.println(condition);


    }


}
