package homeworksss.homework42;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> charCountMap1 = getCharacterCountMap(str1);
        Map<Character, Integer> charCountMap2 = getCharacterCountMap(str2);

        return charCountMap1.equals(charCountMap2);
    }

    private static Map<Character, Integer> getCharacterCountMap(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        return charCountMap;
    }

    public static void main(String[] args) {
        String[][] pairs = {
                {"listen", "silent"},
                {"triangle", "integral"},
                {"apple", "papel"},
                {"hello", "billion"}
        };

        for (String[] pair : pairs) {
            String str1 = pair[0];
            String str2 = pair[1];
            if (areAnagrams(str1, str2)) {
                System.out.println(str1 + " и " + str2 + " являются анаграммами.");
            } else {
                System.out.println(str1 + " и " + str2 + " не являются анаграммами.");
            }
        }
    }
}