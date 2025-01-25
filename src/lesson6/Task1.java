package lesson6;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Task1 {
    public static void main(String[] args) {

//        Calendar calendar = Calendar.getInstance();
//
//        int weekYear =  calendar.getFirstDayOfWeek();
//        System.out.println(weekYear);
//
//        Calendar oldCalendar = Calendar.getInstance();
//        oldCalendar.set(2018, Calendar.JANUARY,1,0,0);
//        Date oldTime = oldCalendar.getTime();
//        System.out.println("oldTime = " + oldTime);
//
//        Calendar newCalendar = Calendar.getInstance();
//        Date newTime = newCalendar.getTime();
//        System.out.println("newTime = " + newTime);

//        Calendar oldCalendar = Calendar.getInstance();
//        oldCalendar.set(2021, Calendar.MARCH,16);
//
//        Calendar newCalendar = Calendar.getInstance();
//        System.out.println("newCalendar = " + newCalendar);
//
//        int timeCount = 0;
//        while (oldCalendar.before(newCalendar)){
//            if (Calendar.SATURDAY != )
//        }

        LocalDateTime now = LocalDateTime.now();

        LocalDateTime oldDate = LocalDateTime.of(2021,3,16,0,0);


        System.out.println("oldDate = " + oldDate);


        long timeCount = 0;

        while (oldDate.isBefore(now)) {
            if (oldDate.getDayOfWeek() != DayOfWeek.SATURDAY && oldDate.getDayOfWeek() != DayOfWeek.SUNDAY) {
                timeCount += 6;
            }
            if (oldDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
                timeCount += 8;
            }

            oldDate = oldDate.plusDays(1);

        }

        System.out.println("timeCount = " + timeCount);


    }
}
