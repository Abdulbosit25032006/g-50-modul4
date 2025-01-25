package lesson6Homework.task10;

public class Svetofor {

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";


    public static void main(String[] args) {

        long currentTimeMillis = System.currentTimeMillis();

        while (System.currentTimeMillis() <= (currentTimeMillis + 180_000)) {

            //todo Red led
            int countRed = 0;
            long currentTimeRed = System.currentTimeMillis();
            while (System.currentTimeMillis() <= (currentTimeRed + 4_000)) {
                if (countRed == 0) {
                    System.out.println(RED + Color.STOP + RESET + "\n");
                    countRed++;
                }
            }

            //todo Yellow led
            int countYellow = 0;
            long currentTimeYellow = System.currentTimeMillis();
            while (System.currentTimeMillis() <= (currentTimeYellow + 3_000)) {
                if (countYellow == 0) {
                    System.out.println(YELLOW + Color.WAIT + RESET + "\n");
                    countYellow++;
                }
            }

            //todo Green led
            int countGreen = 0;
            long currentTimGreen = System.currentTimeMillis();
            while (System.currentTimeMillis() <= (currentTimGreen + 5_000)) {
                if (countGreen == 0) {
                    System.out.println(GREEN + Color.GO + RESET + "\n\n\n");
                    countGreen++;
                }
            }


        }

    }


}
