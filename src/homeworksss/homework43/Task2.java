package homeworksss.homework43;

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static List<String> filterAndSortStrings(List<String> strings, String startLetter) {
        return strings.stream()
                .filter(s -> s.startsWith(startLetter)) // Фильтрация по первой букве
                .distinct()                             // Удаление дубликатов
                .sorted()                               // Сортировка в алфавитном порядке
                .collect(Collectors.toList());          // Сбор в новый список
    }

    public static void main(String[] args) {
        List<String> strings = List.of("Apple", "Apricot", "Africa", "Banana", "Avocado", "apple", "Apricot");

        List<String> filteredAndSortedStrings = filterAndSortStrings(strings, "A");

        System.out.println("Отфильтрованные и отсортированные строки: " + filteredAndSortedStrings);
    }
}
