package lesson6Homework.task10;

public class SvetoforBackground {
    public static void main(String[] args) {

        String reset = "\033[0m";             // Rangni tiklash
        String greenBackground = "\033[42m"; // Yashil fon
        String redBackground = "\033[41m";   // Qizil fon
        String yellowBackground = "\033[43m";// Sariq fon

        long currentTimeMillis = System.currentTimeMillis();

        while (System.currentTimeMillis() <= (currentTimeMillis + 180_000)) {

            //todo Red led
            int countRed = 0;
            long currentTimeRed = System.currentTimeMillis();
            while (System.currentTimeMillis() <= (currentTimeRed + 4_000)) {
                if (countRed == 0) {
                    System.out.println(redBackground + Color.STOP + reset + "\n");
                    countRed++;
                }
            }

            // todo Yellow led
            int countYellow = 0;
            long currentTimeYellow = System.currentTimeMillis();
            while (System.currentTimeMillis() <= (currentTimeYellow + 3_000)) {
                if (countYellow == 0) {
                    System.out.println(yellowBackground + Color.WAIT + reset + "\n");
                    countYellow++;
                }
            }

            //todo Green led
            int countGreen = 0;
            long currentTimGreen = System.currentTimeMillis();
            while (System.currentTimeMillis() <= (currentTimGreen + 5_000)) {
                if (countGreen == 0) {
                    System.out.println(greenBackground + Color.GO + reset + "\n\n\n");
                    countGreen++;
                }
            }


        }

    }

}

