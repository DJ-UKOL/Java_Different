package Learning_LocalDate;

import java.time.LocalDate;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        // Получение текущей даты
        LocalDate today = LocalDate.now();
        System.out.println("Сегодня = " + today);
        System.out.println("****************************************");
        // Получение даты в определенном часовом поясе
        // определить текущую дату в Шанхае
        ZoneId timezone = ZoneId.of("Asia/Shanghai");
        LocalDate today2 = LocalDate.now(timezone);
        System.out.println("Сейчас в Шанхае = " + today2);
        System.out.println("****************************************");
        // Получение конкретной даты
        LocalDate today3 = LocalDate.of(2019, 2, 22);
        System.out.println("Сегодня = " + today3);
        // Получение даты по номеру дня
        // Сотый день в 2019 году — это 10 апреля
        LocalDate today4 = LocalDate.ofYearDay(2019, 100);
        System.out.println("Сегодня = " + today4);
        System.out.println("****************************************");
        // Получение даты Unix.
        // Возвращает дату, отсчитанную от 1 января 1970 года
        LocalDate today5 = LocalDate.ofEpochDay(1);
        System.out.println("Сегодня = " + today5);
        System.out.println("****************************************");
        // Получение фрагментов даты
        LocalDate today6 = LocalDate.now();
        System.out.println(today6.getYear());
        System.out.println(today6.getMonth());
        System.out.println(today6.getMonthValue());
        System.out.println(today6.getDayOfMonth());
        System.out.println(today6.getDayOfWeek());
        System.out.println("****************************************");
        // Изменение даты в объекте LocalDate
        LocalDate birthday = LocalDate.of(2019, 2, 28);
        LocalDate nextBirthday = birthday.plusYears(1);
        LocalDate firstBirthday = birthday.minusYears(30);

        System.out.println(birthday);
        System.out.println(nextBirthday);
        System.out.println(firstBirthday);
    }

}
