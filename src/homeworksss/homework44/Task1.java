package homeworksss.homework44;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Из списка целых чисел выделите те значения, которые больше 10;
// отсортируйте эти значения по значению последней цифры в числе и выведите результат на экране
public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(24, 35, 12, 4, 1, 73, 9, 38, 11, 26);

        List<Integer> result = numbers.stream()
                .filter(num -> num > 10)                            // Фильтруем числа больше 10
                .sorted((a, b) -> Integer.compare(a % 10, b % 10))  // Сортируем по последней цифре
                .collect(Collectors.toList());

        System.out.println("Отсортированные числа больше 10 по последней цифре: " + result);
    }
}

