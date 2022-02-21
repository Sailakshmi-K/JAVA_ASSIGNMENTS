package Jdk8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Duration;
import java.util.Date;

public class LocalDateTimeDemo {

    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);

        LocalDate ld=LocalDate.now();
        System.out.println(ld);

        LocalTime lt=LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);

        Month m= ldt.getMonth();
        System.out.println(m);

        int day=ldt.getDayOfMonth();
        int sec=ldt.getSecond();
        int year=ldt.getYear();

        String week= String.valueOf(ldt.getDayOfWeek());

        System.out.println("Seconds : "+sec);
        System.out.println("Day: "+day+" week : "+week+" year : "+year);

        LocalDate date1=LocalDate.of(2000,12,23);
        System.out.println(date1);

        LocalDate date2=LocalDate.of(2002,Month.DECEMBER,23);
        System.out.println(date2);

        Period p=Period.between(date1,date2);
        System.out.println("period : "+p);

        LocalTime time1=LocalTime.of(22,15,05);
        System.out.println(time1);

        LocalTime time2=LocalTime.parse("18:10:05");
        System.out.println(time2);

        Duration dur=Duration.between(time1,time2);
        System.out.println("Duration : "+dur);

    }
}
/*
Mon Feb 21 16:02:05 IST 2022
2022-02-21
16:02:05.225
2022-02-21T16:02:05.225
FEBRUARY
Seconds : 5
Day: 21 week : MONDAY year : 2022
2000-12-23
2002-12-23
period : P2Y
22:15:05
18:10:05
Duration : PT-4H-5M

Process finished with exit code 0
 */