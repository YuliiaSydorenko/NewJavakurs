package homeworksss.homework46;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Task2 {

    public static long getDaysBetweenEarliestAndLatest(List<LocalDate> dates) {
        // Проверка на пустой список
        if (dates == null || dates.isEmpty()) {
            throw new IllegalArgumentException("Список дат не должен быть пустым");
        }

        // Находим самую раннюю и самую позднюю дату в списке
        LocalDate earliestDate = dates.stream().min(LocalDate::compareTo).orElseThrow();
        LocalDate latestDate = dates.stream().max(LocalDate::compareTo).orElseThrow();

        // Вычисляем количество дней между самой ранней и самой поздней датами
        return ChronoUnit.DAYS.between(earliestDate, latestDate);
    }

    public static void main(String[] args) {
        List<LocalDate> dates = List.of(
            LocalDate.of(2022, 2, 24),
            LocalDate.of(2022, 3, 8),
            LocalDate.of(2024, 11, 14),
            LocalDate.of(2024, 11, 20)
        );
        long daysBetween = getDaysBetweenEarliestAndLatest(dates);
        System.out.println("Количество дней между самой ранней и самой поздней датами: " + daysBetween);
    }
}

    
