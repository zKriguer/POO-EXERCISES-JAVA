package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.TimeZone;

public class Program {
    public static void main(String[] args) throws ParseException {
        LocalDate date = LocalDate.parse("2023-07-11");
        LocalDateTime secondDate = LocalDateTime.parse("2023-07-11T01:30:26");
        Instant thirdDate = Instant.parse("2023-07-11T01:30:26Z");

        LocalDate pastWeekLocalDate = date.minusDays(7);
        LocalDate nextWeekLocalDate = date.plusDays(7);

        System.out.println("pastWeekLocalDate " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate " + nextWeekLocalDate);

        System.out.println("-----------------------------------------");

        LocalDateTime pastWeekLocalDateTime = secondDate.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = secondDate.plusDays(7);

        System.out.println("pastWeekLocalDateTime " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime " + nextWeekLocalDateTime);

        System.out.println("-----------------------------------------");

        Instant pastWeekInstant = thirdDate.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = thirdDate.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant " + pastWeekInstant);
        System.out.println("nextWeekInstant " + nextWeekInstant);

        System.out.println("-----------------------------------------");

        Duration time1 = Duration.between(pastWeekLocalDateTime, secondDate);
        System.out.println("Days between pastWeek and nextWeek " + time1.toDays());

        Duration time2 = Duration.between(pastWeekLocalDate.atStartOfDay(), date.atStartOfDay());
        System.out.println("Days between pastWeekLocal and nextWeekLocal " + time2.toDays());

        Duration time3 = Duration.between(pastWeekInstant, thirdDate);
        System.out.println("Days between pastWeekInstant and nextWeekInstant " + time3.toDays());

        System.out.println("Simple Date Format");
        System.out.println("-----------------------------------------");

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date x1 = new Date();

        Date y1 = sdf1.parse("16/06/2023");
        Date y2 = sdf2.parse("16/06/2023 15:42:07");
        Date y3 = Date.from(Instant.parse("2023-07-11T15:42:07Z"));

        System.out.println("Y1: " + sdf1.format(y1));
        System.out.println("Y2: " + sdf2.format(y2));
        System.out.println("-----------------------------------------");
        System.out.println("X1: " + sdf1.format(x1));
        System.out.println("X1 WITH HOURS: " + sdf2.format(x1));
        System.out.println("-----------------------------------------");
        System.out.println("Y3 UTC: " + sdf2.format(y3));
        System.out.println("Y3 UTC - GMT: " + sdf3.format(y3));



    }
}
