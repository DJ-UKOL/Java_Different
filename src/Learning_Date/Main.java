package Learning_Date;

import java.util.Date;

/*
 * https://javarush.ru/groups/posts/1941-kak-ne-poterjatjhsja-vo-vremeni--datetime-i-calendar
*/
public class Main {
    public static void main(String[] args) throws InterruptedException {
        String date1 = "11 июня 2018 года";
        System.out.println(date1);
        /* **************************************** */
        // хранит дату в миллисекундах, которые прошли с 1 января 1970 года
        // Unix-время
        Date date2 = new Date();
        System.out.println(date2);
        /* **************************************** */
        // указать количество миллисекунд,
        // которое прошло с 00:00 1 января 1970 года до требуемой даты:
        Date date3 = new Date(1212121212121L);
        System.out.println(date3);
        /* **************************************** */
        // метод Date.getTime() вернет количество миллисекунд,
        // прошедших с полуночи 1 января 1970 года.
        Date date4 = new Date();
        Date date5 = new Date();
        System.out.println((date4.getTime() > date5.getTime())?
                "date4 позже date5" : "date4 раньше date5");
        /* **************************************** */
        //  Метод Date: before() проверяет, была ли наша дата раньше той,
        //  которую мы передаем в качестве аргумента
        Date date6 = new Date();
        Thread.sleep(2000);//приостановим работу программы на 2 секунды
        Date date7 = new Date();
        System.out.println(date6.before(date7));
        /* **************************************** */
        // Метод Date: after(), проверяет, была ли наша дата позже той,
        // которую мы передаем в качестве аргумента
        Date date8 = new Date();
        Thread.sleep(2000);//приостановим работу программы на 2 секунды
        Date date9 = new Date();
        System.out.println(date8.after(date9));
        /* **************************************** */
        // Deprecated (“нерекомендуемый‘)
        Date date10 = new Date();
        System.out.println(date10.getHours());

    }
}