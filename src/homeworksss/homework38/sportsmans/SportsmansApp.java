package homeworksss.homework38.sportsmans;

import java.util.Arrays;
import java.util.Comparator;

public class SportsmansApp {
    public static void main(String[] args) {

        Sportsman[] sportsman = {
                new Sportsman("Alice", 25, 90),
                new Sportsman("Bob", 30, 85),
                new Sportsman("Charlie", 20, 95),
                new Sportsman("Diana", 27, 88)
        };

        // 1. Сортировка по естественному порядку (по имени)
        Arrays.sort(sportsman);
        System.out.println("Сортировка по имени (естественный порядок):");
        System.out.println(Arrays.toString(sportsman));

        // 2. Сортировка по рейтингу с использованием класса ScoreComparator
        Arrays.sort(sportsman, new ScoreComparator());
        System.out.println("\nСортировка по рейтингу (score):");
        System.out.println(Arrays.toString(sportsman));

        // 3. Сортировка по возрасту с использованием анонимного класса Comparator
        Arrays.sort(sportsman, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman s1, Sportsman s2) {
                return Integer.compare(s1.getAge(), s2.getAge());
            }
        });
        System.out.println("\nСортировка по возрасту (age):");
        System.out.println(Arrays.toString(sportsman));


    }
}



