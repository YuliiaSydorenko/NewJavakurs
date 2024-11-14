package homeworksss.homework46;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Task1 {
    public static void main(String[] args) {

        // 1. Текущая дата
        LocalDate currentDate = LocalDate.now();
        System.out.println("Текущая дата: " + currentDate);

        // Текущий год, месяц и день
        int year = currentDate.getYear();
        int month = currentDate.getMonthValue();
        int day = currentDate.getDayOfMonth();
        System.out.println("Текущий год: " + year);
        System.out.println("Текущий месяц: " + month);
        System.out.println("Текущий день: " + day);

        // 2. Создать дату - день рождения и вывести на экран
        LocalDate birthday = LocalDate.of(1977, 11, 24);
        System.out.println("Дата рождения: " + birthday);

        // 3. Создать две даты и проверить на равенство
        LocalDate date1 = LocalDate.of(2022, 5, 15);
        LocalDate date2 = LocalDate.of(2022, 5, 15);
        boolean areEqual = date1.equals(date2);
        System.out.println("Даты равны: " + areEqual);

        // 4. Текущее время
        LocalTime currentTime = LocalTime.now();
        System.out.println("Текущее время: " + currentTime);

        // Текущее время + 3 часа
        LocalTime timePlus3Hours = currentTime.plusHours(3);
        System.out.println("Текущее время + 3 часа: " + timePlus3Hours);

        // 5. Создать дату на неделю позже сегодняшней
        LocalDate dateNextWeek = currentDate.plusWeeks(1);
        System.out.println("Дата на неделю позже: " + dateNextWeek);

        // Дата на год раньше сегодняшней
        LocalDate dateLastYear = currentDate.minus(1, ChronoUnit.YEARS);
        System.out.println("Дата на год раньше: " + dateLastYear);

        // Дата на год позже сегодняшней
        LocalDate dateNextYear = currentDate.plus(1, ChronoUnit.YEARS);
        System.out.println("Дата на год позже: " + dateNextYear);

        // 6. Завтра и вчера
        LocalDate tomorrow = currentDate.plusDays(1);
        LocalDate yesterday = currentDate.minusDays(1);
        System.out.println("Завтра: " + tomorrow);
        System.out.println("Вчера: " + yesterday);

        // Проверка: до или после сегодняшней даты
        System.out.println("Завтра после сегодняшней даты? " + tomorrow.isAfter(currentDate));
        System.out.println("Вчера до сегодняшней даты? " + yesterday.isBefore(currentDate));
    }
}
