package homeworksss.homework42;


import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static class WordLengthCounter {
        public static Map<Integer, Integer> countWordsByLength(String text) {
            Map<Integer, Integer> lengthCountMap = new HashMap<>();

            String[] words = text.split("[^\\p{L}]+");

            for (String word : words) {
                int length = word.length();
                if (length > 0) {
                    lengthCountMap.put(length, lengthCountMap.getOrDefault(length, 0) + 1);
                }
            }
            return lengthCountMap;
        }

        public static void main(String[] args) {

            System.out.println("========Латиница==========");
            String text = "This is an example sentence, to demonstrate counting word lengths!";
            Map<Integer, Integer> result = countWordsByLength(text);
            for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
                System.out.println("Длина " + entry.getKey() + ": " + entry.getValue() + " слов(а)");
            }

            System.out.println("========Кирилица==========");


            String text1 = "Это пример текста для демонстрации подсчета количества слов различной длинны ";
            Map<Integer, Integer> result1 = countWordsByLength(text1);
            for (Map.Entry<Integer, Integer> entry : result1.entrySet()) {
                System.out.println("Длина " + entry.getKey() + ": " + entry.getValue() + " слов(а)");
            }

        }
    }
}


