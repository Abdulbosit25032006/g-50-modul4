package lesson5Homework.task3;

public class Singleton {

    private static Singleton instance;

    public Singleton() {
        System.out.println("Creating Singleton");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }


}
