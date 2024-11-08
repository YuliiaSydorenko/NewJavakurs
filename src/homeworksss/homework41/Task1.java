package homeworksss.homework41;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static Map<String, Integer> getWordFrequency(String text) {
        Map<String, Integer> wordFrequency = new HashMap<>();

        if (text == null || text.isEmpty()) {
            return wordFrequency; // Вернем пустой словарь, если текст пустой или не инициализирован
        }

        // Приводим текст к нижнему регистру и заменяем все не буквенные символы пробелами
        String[] words = text.toLowerCase().replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) { // Проверяем, что слово не пустое
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }

        return wordFrequency;
    }

    public static void main(String[] args) {
        String text = "Тестовая строка для тестирования, где слово 'тест' встречается несколько раз: тест, тестовая, тестирование.";
        System.out.println(getWordFrequency(text));
    }

}
