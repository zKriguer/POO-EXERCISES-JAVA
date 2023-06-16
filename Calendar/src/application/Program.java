package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2023-07-11T03:15:32Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);

        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();

        System.out.println(sdf.format(d));

        int seconds = cal.get(Calendar.SECOND);
        int minutes = cal.get(Calendar.MINUTE);
        int month = cal.get(Calendar.MONTH);

        System.out.println("--------------------------------");

        System.out.println("Seconds: " + seconds);
        System.out.println("Minutes: " + minutes);
        System.out.println("Month: " + month);

    }
}
