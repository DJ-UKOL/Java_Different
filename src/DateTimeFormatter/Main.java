package DateTimeFormatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/*
 * https://javarush.ru/quests/lectures/questsyntaxpro.level16.lecture07
 */
public class Main {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yy");
        String text = dtf.format( LocalDateTime.now());
        System.out.println(text);
        System.out.println("****************************************");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MMMM-dd-yyyy");
        String text2 = dtf2.format( LocalDateTime.now() );
        System.out.println(text2);
        System.out.println("****************************************");
        // Парсинг
        // задаем шаблон парсинга
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM-dd-yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse("February-23-2019", dtf3);
        System.out.println(date);
        System.out.println("****************************************");
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime time = LocalTime.parse("23:59:59", dtf4);
        System.out.println(time);
    }

}
