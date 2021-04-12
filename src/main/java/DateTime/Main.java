package DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Main {
    public static void main(String args[]){
        LocalDate date = LocalDate.of(2020, 4, 12);
        int year = date.getYear();
        Month month = date.getMonth();
        int dayOfMonth = date.getDayOfMonth();
        LocalDate now = LocalDate.now();

        System.out.println(year);
        System.out.println(month);
        System.out.println(dayOfMonth);
        System.out.println(now);


        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDate date2 = LocalDate.parse("2020-04-12");
        LocalTime time2 = LocalTime.parse("23:45:20");

        System.out.println(date2);
        System.out.println(time2);


    }
}
