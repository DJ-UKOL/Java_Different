package Learning_Calendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // Создадим календарь с датой 25 января 2017 года
        Calendar calendar = new GregorianCalendar(2017, 0 , 25);
        System.out.println(calendar);
        // получить из календаря простую дату
        Date date = calendar.getTime();
        System.out.println(date);
        System.out.println("****************************************");
        // константы
        GregorianCalendar calendar2 = new GregorianCalendar(2017, Calendar.JANUARY , 25);
        // установим время 19:42:12
        Calendar calendar3 = new GregorianCalendar();
        calendar3.set(Calendar.YEAR, 2017);
        calendar3.set(Calendar.MONTH, 0);
        calendar3.set(Calendar.DAY_OF_MONTH, 25);
        calendar3.set(Calendar.HOUR_OF_DAY, 19);
        calendar3.set(Calendar.MINUTE, 42);
        calendar3.set(Calendar.SECOND, 12);
        System.out.println(calendar3.getTime());
        System.out.println("****************************************");
        // вернем дату, которую мы создали, на 2 месяца назад
        Calendar calendar4 = new GregorianCalendar(2017, Calendar.JANUARY , 25);
        calendar4.set(Calendar.HOUR, 19);
        calendar4.set(Calendar.MINUTE, 42);
        calendar4.set(Calendar.SECOND, 12);
        calendar4.add(Calendar.MONTH, -2);  //чтобы отнять значение - в метод нужно передать отрицательное число
        System.out.println(calendar4.getTime());
        System.out.println("****************************************");
        // отключить перенос дат, перенести дату которую мы создали, на 2 месяца назад
        Calendar calendar5 = new GregorianCalendar(2017, Calendar.JANUARY , 25);
        calendar5.set(Calendar.HOUR, 10);
        calendar5.set(Calendar.MINUTE, 42);
        calendar5.set(Calendar.SECOND, 12);
        calendar5.roll(Calendar.MONTH, -2);
        System.out.println(calendar5.getTime());
        System.out.println("****************************************");
        // Все поля объекта Calendar можно получить по отдельности. Метод get()
        GregorianCalendar calendar6 = new GregorianCalendar(2017, Calendar.JANUARY , 25);
        calendar6.set(Calendar.HOUR, 10);
        calendar6.set(Calendar.MINUTE, 42);
        calendar6.set(Calendar.SECOND, 12);
        System.out.println("Год: " + calendar6.get(Calendar.YEAR));
        System.out.println("Месяц: " + calendar6.get(Calendar.MONTH));
        System.out.println("Порядковый номер недели в месяце: " + calendar6.get(Calendar.WEEK_OF_MONTH));//порядковый номер недели в месяце
        System.out.println("Число: " + calendar6.get(Calendar.DAY_OF_MONTH));
        System.out.println("Часы: " + calendar6.get(Calendar.HOUR));
        System.out.println("Минуты: " + calendar6.get(Calendar.MINUTE));
        System.out.println("Секунды: " + calendar6.get(Calendar.SECOND));
        System.out.println("Миллисекунды: " + calendar6.get(Calendar.MILLISECOND));
        System.out.println("****************************************");
        // Создадим дату, обозначающую битву при Каннах,
        // в которой Ганнибал победил войско Рима.
        // Это произошло 2 августа 216 г. до н. э.
        GregorianCalendar cannes = new GregorianCalendar(216, Calendar.AUGUST, 2);
        cannes.set(Calendar.ERA, GregorianCalendar.BC);
        // вывести дату в более понятном нам формате
        DateFormat df = new SimpleDateFormat("dd MMM yyy GG");
        System.out.println(df.format(cannes.getTime()));
        System.out.println("****************************************");
        // создание объекта SimpleDateFormat и форматирование Date
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date2 = new Date(1212121212121L);
        System.out.println(formatter.format(date2));
        System.out.println("****************************************");
        // перевод java string to date
        // Создаем строку, с которой нужно задать дату
        String strDate = "Sat, April 4, 2020";
        // Создаем новый объект SimpleDateFormat с шаблоном,
        // который совпадает с тем, что у нас в строке (иначе распарить не получится)
        SimpleDateFormat formatter2 = new SimpleDateFormat("EEE, MMMM d, yyyy", Locale.ENGLISH);
        // Создаём дату с помощью форматера, который в свою очередь парсит её из входной строки
        try {
            Date date3 = formatter2.parse(strDate);
            System.out.println(date3);
            // сделать тот же формат
            System.out.println(formatter2.format(date3));
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("****************************************");

    }
}
