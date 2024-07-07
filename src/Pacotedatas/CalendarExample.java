package Pacotedatas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class CalendarExample {
    public static void main(String[] args) {
        // Criando uma instância de Calendar
        Calendar calendar = Calendar.getInstance();

        // Exibindo a data e hora atuais
        System.out.println("Data e hora atuais: " + calendar.getTime());

        // Definindo uma data específica
        calendar.set(2023, Calendar.APRIL, 23, 12, 30, 45);
        System.out.println("Data definida: " + calendar.getTime());

        // Obtendo componentes individuais da data
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Os meses são base 0
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.println("Ano: " + year);
        System.out.println("Mês: " + month);
        System.out.println("Dia: " + day);
        System.out.println("Hora: " + hour);
        System.out.println("Minuto: " + minute);
        System.out.println("Segundo: " + second);

        // Adicionando tempo à data
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println("Data após adicionar 5 dias: " + calendar.getTime());

        // Subtraindo tempo da data
        calendar.add(Calendar.MONTH, -2);
        System.out.println("Data após subtrair 2 meses: " + calendar.getTime());

        // Definindo um TimeZone específico
        calendar.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.println("Data e hora em New York: " + calendar.getTime());

        // Formatando a data com SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String formattedDate = sdf.format(calendar.getTime());
        System.out.println("Data formatada: " + formattedDate);

        // Convertendo Calendar para Date
        Date date = calendar.getTime();
        System.out.println("Date a partir do Calendar: " + date);
    }
}