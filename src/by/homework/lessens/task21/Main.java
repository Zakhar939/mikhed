package by.homework.lessens.task21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();


        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("d MMMM uuuu", Locale.forLanguageTag("ru"));
        String result1 = LocalDate.now().format(formatter1);
        System.out.println(result1);


        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("d MMMM uuuu, hh:mm:ss a", Locale.ENGLISH);
        String result2 = now.format(formatter2);
        System.out.println(result2);


        String str3 = "2023-03-19 : 10:12:24 AM";
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("uuuu-MM-dd : hh:mm:ss a", Locale.ENGLISH);
        LocalDateTime dateTime3 = LocalDateTime.parse(str3, formatter3);
        System.out.println(dateTime3);


        String str4 = "пн 20.03.23 г. время: 15:07:28";
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("E dd.MM.uu 'г. время:' HH:mm:ss", Locale.forLanguageTag("ru"));
        LocalDateTime dateTime4 = LocalDateTime.parse(str4, formatter4);
        System.out.println(dateTime4);


        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("EEEE d MMMM uuuu 'время:' hh.mm.ss a", Locale.forLanguageTag("ru"));
        String result5 = now.format(formatter5);
        System.out.println(result5);
    }
}

