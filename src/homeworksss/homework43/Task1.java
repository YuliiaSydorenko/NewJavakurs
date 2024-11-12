package homeworksss.homework43;

import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

        public static List<Integer> filterNumbers(List<Integer> numbers) {
            return numbers.stream()
                    .filter(num -> num % 2 == 0) // Четные числа
                    .filter(num -> num > 10)     // Больше 10
                    .filter(num -> num < 100)    // Меньше 100
                    .collect(Collectors.toList()); // Собираем в новый список
        }

        public static void main(String[] args) {
            List<Integer> numbers = List.of(5, 12, 46, 100, -32, -48,  8, 15, 98, -150, 22);

            List<Integer> filteredNumbers = filterNumbers(numbers);

            System.out.println("Отфильтрованные числа: " + filteredNumbers);
        }
    }

