package example.lesson1;


public class CardImpl {
    public static void main(String[] args) {

//        singleTransfer();

        long begin = System.currentTimeMillis();
        Card fromCard = new Card("9860", 1200, true);
        Card toCard = new Card("8600", 200, true);

        Runnable task1 = () -> {
            isBalance(fromCard, 600);
        };
        Runnable task2 = () -> {
            isBlocked(fromCard);
        };
        Runnable task3 = () -> {
            isBlocked(toCard);
        };

        Thread thread1 = new Thread(task1);
        thread1.start();

        Thread thread2 = new Thread(task2);
        thread2.start();

        Thread thread3 = new Thread(task3);
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        transfer(fromCard,toCard,500);
        long end = System.currentTimeMillis();
        System.out.println("Time : " + (end - begin));


    }

    private static void singleTransfer() {
        long begin = System.currentTimeMillis();
        Card fromCard = new Card("9860", 1200, true);
        Card toCard = new Card("8600", 200, true);

        boolean balance = isBalance(fromCard, 600);

        boolean from = isBlocked(fromCard);
        boolean to = isBlocked(toCard);

        if (from && to && balance) {
            transfer(fromCard, toCard, 500);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time : " + (end - begin));
    }

    private static boolean isBalance(Card fromCard, int amount) {
        try {
            Thread.sleep(1500);
            System.out.println("Card balance ...");
            if (fromCard.getBalance() >= amount) {
                return true;
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return false;
    }

    private static void transfer(Card fromCard, Card toCard, int amount) {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Card transfer ");
    }

    private static boolean isBlocked(Card card) {
        System.out.println("Card checked ... ");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Card active ... ");
        return true;
    }

}
