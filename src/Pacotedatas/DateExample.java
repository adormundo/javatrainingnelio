package Pacotedatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) throws ParseException {
        // Exemplo com SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // Criando uma data a partir de uma string
        String dateInString = "23/04/2023 12:30:45";
        Date date = sdf.parse(dateInString);
        System.out.println("Data parseada com SimpleDateFormat: " + date);

        // Exemplo com padrão ISO 8601
        String isoDateString = "2023-04-23T12:30:45Z";
        Instant instant = Instant.parse(isoDateString);
        System.out.println("Instant parseado com ISO 8601: " + instant);

        // Convertendo Instant para Date
        Date dateFromInstant = Date.from(instant);
        System.out.println("Date convertida a partir do Instant: " + dateFromInstant);

        // Formatando uma data usando DateTimeFormatter com padrão ISO 8601
        DateTimeFormatter formatter = DateTimeFormatter.ISO_INSTANT;
        String isoFormattedDate = formatter.format(instant);
        System.out.println("Data formatada com DateTimeFormatter (ISO 8601): " + isoFormattedDate);

        // Trabalhando com ZonedDateTime
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("America/New_York"));
        System.out.println("ZonedDateTime: " + zonedDateTime);

        // Convertendo ZonedDateTime para LocalDateTime
        LocalDateTime localDateTime = zonedDateTime.toLocalDateTime();
        System.out.println("LocalDateTime: " + localDateTime);
    }
}