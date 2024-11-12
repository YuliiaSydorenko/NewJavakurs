package homeworksss.homework44;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//Имеется список целых чисел.
//
//Необходимо отфильтровать этот список, оставив только чётные числа,
// затем каждое число умножить на 2, и собрать результат в новый список
public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(24, 35, 12, 4, 1, 73, 9, 38, 11, 26);

        List<Integer> result = numbers.stream()
                .filter(num -> num % 2 == 0)         // Оставляем только четные числа
                .map(num -> num * 2)                 // Умножаем каждое число на 2
                .collect(Collectors.toList());       // Собираем результат в новый список

        System.out.println("Чётные числа, умноженные на 2: " + result);
    }


}
