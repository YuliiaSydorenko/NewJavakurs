package homeworksss.homework40;
import java.util.*;
import java.util.stream.Collectors;
public class Task1 {

    public static List<String> getUniqueSortedWords(String input) {
        // Удаляем все символы, кроме букв и пробелов
        String cleanedInput = input.replaceAll("[^a-zA-Zа-яА-Я ]", "");

        // Преобразуем строку в список слов и убираем дубликаты
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(cleanedInput.split(" ")));

        // Сортируем по длине слов, если длина одинакова - по алфавиту
        List<String> sortedWords = uniqueWords.stream()
                .sorted(Comparator.comparingInt(String::length)
                        .thenComparing(Comparator.naturalOrder()))
                .collect(Collectors.toList());

        return sortedWords;
    }

    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(testString);
        System.out.println(Task1.getUniqueSortedWords(testString));
    }

}
