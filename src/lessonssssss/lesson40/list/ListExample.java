package lessonssssss.lesson40.list;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        //Конструкторы ArrayList

        List<Integer> list = new ArrayList<>(); // Создает список с емкостью 10 элементов
        list = new ArrayList<>(50); // Создает список с емкостью 50 элементов
        list = new ArrayList<>(List.of(1, -10,5, 0, 25, -100)); //Принимает коллекцию и создает список
        // содержащий список все элементы коллекции( копирование другой коллекции)

        //Конструкторы LinkedLst
        list = new LinkedList<>();
        list = new LinkedList<>(List.of(1, -10, 5,  0, 25, -100));

        //Методы интерфейсов List
        //boolean add(E e) - добавляет элемент в конец списка
        list.add(1000);
        list.add(-100);

        System.out.println("list"  + list);

        //void add (int index, E element)
        list.add(2,100);
        System.out.println(list);

        //E get(int index) - возвращает элемент по индексу
        int valye = list.get(5);
        System.out.println(valye);

        // E remove(int index) - удаляет элемент по индексу
        System.out.println((list.remove(5)));
        System.out.println(list);

        //метод удаления по значению
        list.remove(Integer.valueOf(1000));
        System.out.println(list);

        //Сортировка Поиск элементов по значению возвращает индекс
        // int indexOf(Object obj)
        // int lastIndexOf(Object obj)

        System.out.println("list.indexOf: " + list.indexOf(-100));
        System.out.println("list.lastIndexOf: " + list.lastIndexOf(-100));

        //void sort(Comparator <? super.....

        list.sort((i1,i2) -> i2.compareTo(i1));
        // list.sort((i1,i2) -> i2.compareTo(i1)); это аналог того, что ниже, прописано через анонимный класс:
       /* list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i2.compareTo(i1);
            }
        });*/


        System.out.println(list);

        //List<E> sublist(int indexFrom, int indexTo) - возвращает список из элементов по индексу от и до

        List<Integer> subList = list.subList(1, 5);
        System.out.println(subList);






    }
}
