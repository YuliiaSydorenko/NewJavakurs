package homeworksss.homework44;
//Имеется список строк. Используя Stream API, найдите строку с минимальной длиной.
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task2 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "pear", "grapes", "orange");

        // Находим строку с минимальной длиной
        Optional<String> shortestString = strings.stream()
                .min(Comparator.comparingInt(String::length));

        // Проверяем наличие минимальной строки и выводим результат
        shortestString.ifPresent(s -> System.out.println("Строка с минимальной длиной: " + s));
    }
}