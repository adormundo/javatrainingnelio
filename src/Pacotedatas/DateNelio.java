package Pacotedatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class DateNelio {
    public static void main(String[] args) throws ParseException {
        String patternDate = "dd/MM/yyyy";
        String patternDateHour = "dd/MM/yyyy HH:mm:ss";
        SimpleDateFormat sdfDate = new SimpleDateFormat(patternDate);
        SimpleDateFormat sdfDateHour = new SimpleDateFormat(patternDateHour);

        // Saida: Fri Jun 28 00:00:00 BRT 2024
        Date y1 = sdfDate.parse("28/06/2024");

        // Saida: Fri Jun 28 19:55:00 BRT 2024
        Date y2 = sdfDateHour.parse("28/06/2024 19:55:00");

        // Saida: 28/06/2024
        System.out.println(sdfDate.format(y1));

        // Saida: 28/06/2024 19:55:00
        System.out.println(sdfDateHour.format(y2));

        // Data atual
        Date d1 = new Date();
        Date d2 = new Date(System.currentTimeMillis());
        System.out.println(sdfDateHour.format(d1));
        System.out.println(sdfDateHour.format(d2));



        // ISO
        SimpleDateFormat sdfIsoUTC = new SimpleDateFormat(patternDateHour);
        sdfIsoUTC.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date d3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(sdfIsoUTC.format(d3));
    }
}