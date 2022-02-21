package Jdk8;

import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ZonedDateTimeDemo {
    public static void main(String[] args) {

        ZonedDateTime date1 = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
        System.out.println("date1: " + date1);

        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println("ZoneId: " + id);

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("CurrentZone: " + currentZone);

    }
}

/*
date1: 2007-12-03T10:15:30+05:00[Asia/Karachi]
ZoneId: Europe/Paris
CurrentZone: Asia/Calcutta

Process finished with exit code 0

 */