package Imtihon.example1.task2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.concurrent.*;

public class MultiThreadYearsDays {

    public static void main(String[] args) {

        long begin = System.currentTimeMillis();

        LocalDate oldDate = LocalDate.of(1990, 1, 1);
        System.out.println("oldDate = " + oldDate);

        LocalDate currentDate = LocalDate.now();
        System.out.println("currentDate = " + currentDate);


        LocalDate whileDate = oldDate;

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        try {
            while (whileDate.isBefore(currentDate)) {

                int year = whileDate.getYear();
//                Month month = whileDate.getMonth();
//                int dayOfYear = whileDate.getDayOfYear();

                LocalDate toDate = LocalDate.of(year, 1, 1);

                LocalDate fromDate = LocalDate.of(year, 12, 31);

                System.out.println("toDate = " + toDate);

                Callable<Integer> callableTask = () -> currentDays(toDate, fromDate);


                Future<Integer> countDaysOfYears = executorService.submit(callableTask);

                whileDate = whileDate.plusYears(1);


                Integer days = countDaysOfYears.get();

                System.out.println("days = " + days);

            }


        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        long end = System.currentTimeMillis();

        System.out.println(end - begin);

    }

    private static Integer currentDays(LocalDate toDate, LocalDate fromDate) {

//        sleep();//vaqt otkazish uchun

        LocalDate whileDate = toDate;

        int dayCount = 0;

        while (whileDate.isBefore(fromDate) || whileDate.equals(fromDate)) {

            // whileDate.getDayOfWeek() != DayOfWeek.SATURDAY && whileDate.getDayOfWeek() != DayOfWeek.SUNDAY
            if (whileDate.getDayOfWeek() != DayOfWeek.SUNDAY && whileDate.getDayOfWeek() != DayOfWeek.SATURDAY) {
                dayCount++;
            }

            whileDate = whileDate.plusDays(1);
        }
        return dayCount;
    }

    private static void sleep() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
