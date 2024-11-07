package lessonssssss.lesson40.setExample;

import java.util.*;

public class SetExample {
    public static double startValues = 0;

    static {
        startValues = startValues;
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set = new HashSet<>(20);

        set = new HashSet<>(List.of(1, 2, 3, 5, 6, 6, 6, 6, 6, 5, 3));

        System.out.println(set);

        System.out.println("+++++++++++++++++++++++++++++++11:50++++++++++++++++++++++++++++++++++++++++++");


        List<Integer> startValues = new ArrayList<>(List.of(15, 1, 2, 3, 4, 3, 8, 6, 15, 7, 0, 16, 32));
        System.out.println(startValues);

        Set<Integer> integers = new LinkedHashSet<>(startValues);
        System.out.println(integers);

        Set<Integer> linkedSet = new LinkedHashSet<>(startValues);
        System.out.println(linkedSet);
        System.out.println(integers.add(100));
        System.out.println(integers.add(100));
        System.out.println(integers);
        System.out.println(integers.remove(100));
        System.out.println(integers);
        System.out.println(integers.remove(100));

        System.out.println("===========boolean contains(Object obj===================");
        System.out.println(integers.contains(100));
        System.out.println(integers.contains(32));


        for (Integer value : integers) {
            System.out.println(value + ",");

        }
        System.out.println();

        System.out.println("startValues:" + startValues);
        List<Integer> resultlist = getUniquesList(startValues);
        System.out.println(resultlist);

        System.out.println("===========SortedSet Конструкторы===================");

        //SortedSet Конструкторы

        // Конструктор1 по умолчанию
        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.addAll(startValues);
        System.out.println("sortedSet: " + sortedSet);


        // Конструктор 2
        sortedSet = new TreeSet<>(startValues);
        System.out.println(sortedSet);


        // Конструктор 3
        SortedSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
        treeSet.addAll(sortedSet);
        treeSet.add(10);

        System.out.println("TreeSet: " + treeSet);

        System.out.println("++++++3 метода ++++++++++");

        // 1  first() - возвращает самый первый  элемент

        System.out.println("first: "+ treeSet.first());

        // 2  last() - возвращает наибольший (последний) элемент

        System.out.println("last:" + treeSet.last());

        //  3   headSet (E element) - возвращает часть множества, элементы, которые строго меньше, чем element

        SortedSet<Integer> integerSortedSet = new TreeSet<>(startValues);
        System.out.println("integerSortedSet: "+ integerSortedSet);
        SortedSet<Integer> headSet = integerSortedSet.headSet(8);
        System.out.println("headSet: " +headSet);

        //  4  teilSet (E element) - возвращает часть множества, элементы, которые строго больше, или равны, чем element
        SortedSet<Integer> tailSet = integerSortedSet.tailSet(8);
        System.out.println("teilSet: " + tailSet);

        //  5  subSet (E from element to element) - возвращает часть множества, элементы "между"

        System.out.println("subSet: " + integerSortedSet.subSet(3,16));


        // 6 comparator
        System.out.println("comparator: "+ integerSortedSet.comparator());



    }

    //Написать метод, который принимает список и возвращает список без дубликатов начального списка

       public static <T> List<T> getUniquesList(List<T>list) {
           Set<T> set = new LinkedHashSet<>(list);
           return new ArrayList<>(set);


       }
       public static void test(){
        String testStr = "Тестовая строка по словам";
        String newString= testStr.replaceAll("[^a-zA-Z0-9а-яА-Я]","");
           System.out.println(newString);

           String[] words = newString.split(" ");

           System.out.println(Arrays.toString(words));



       }
    }
