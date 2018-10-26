package org.joda.time;

import org.joda.time.format.ISODateTimeFormat;

public class TempTest {

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone BERLIN = DateTimeZone.forID("Europe/Berlin");

    public static void main(String[] args) {

        LocalDateTime base = new LocalDateTime(2012, 1, 1, 0, 0);
        System.out.println(base);
        System.out.println(base.toDateTime(DateTimeZone.UTC).withZone(DateTimeZone.forOffsetHours(8)).toLocalDateTime());
        System.out.println(new DateTime(base, DateTimeZone.getDefault()));
//        2012-01-01T00:00:00.000
        System.out.println(new DateTime(base, (DateTimeZone) null));
//        2012-01-01T00:00:00.000
        System.out.println(new DateTime(base, DateTimeZone.forOffsetHours(8)));
//        2012-01-01T00:00:00.000
        
        ISODateTimeFormat.dateTimeParser().parseDateTime("2017-09-01T15:00:00Z");

//        DateTime now = DateTime.now();
//        int days = Days.daysBetween(now, now.minusDays(1)).getDays();
//        System.out.println(days);
//
//        Days value = Days.daysBetween(
//                DateTime.now(BERLIN),
//                DateTime.now(BERLIN).minusDays(1));
//        System.out.println(value.getDays());
    }

}
