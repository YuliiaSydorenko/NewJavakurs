package homeworksss.homework41;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

                Map<String, Integer> frequencyMap = frequencyDictionary(text);
                frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

                Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);

                System.out.println("\nВхождение символов: ");
                frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v + "; "));
                System.out.println();
            }

            // Метод для подсчета частоты вхождений символов в строке
            public static Map<Character, Integer> frequencyCharsDictionary(String text) {
                Map<Character, Integer> charFrequencyMap = new HashMap<>();

                // Перебираем каждый символ строки
                for (char ch : text.toCharArray()) {
                    // Увеличиваем счетчик для текущего символа
                    charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
                }

                return charFrequencyMap;
            }

            // Метод для подсчета частоты вхождений слов
            public static Map<String, Integer> frequencyDictionary(String text) {
                Map<String, Integer> wordFrequencyMap = new HashMap<>();

                String[] words = text.split("\\W+"); // Разделяем по пробелам и другим не-буквенным символам

                for (String word : words) {
                    if (!word.isEmpty()) {
                        word = word.toLowerCase(); // Игнорируем регистр
                        wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
                    }
                }

                return wordFrequencyMap;
            }
        }




