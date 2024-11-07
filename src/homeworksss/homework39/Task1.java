package homeworksss.homework39;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<Integer> integers  = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Integer> integers1  = new LinkedList<>(List.of( 3, 4, 5, 6, 7, 6,8,9 ));
        System.out.println(intersectionGen(integers, integers1));
        System.out.println(intersectionGen(integers1 , integers));

        List<String>strings = new ArrayList<>(List.of("a" ,"b", "c", "d"));
        List<String>strings1 = new LinkedList<>(List.of("d" ,"b", "e", "d"));
      //  System.out.println(intersectionGen(strings, strings1));

    }

    public static List<Integer> intersectionGen(List<Integer> list1, List<Integer>list2){
        List<Integer>result = new ArrayList<>(list1);
        result.retainAll(list2);

        return result;
    }
}

    //private static String intersectionGen(List<String> strings, List<String> strings1) {
       // return null;


     /* public static void main(String[] args) {
            Collection<String> strings = new ArrayList<>();


            strings.add("Картофель");
            strings.add("Колбаса");
            System.out.println(strings.toString());



            strings.addAll(List.of("Морковь", "Огурец", "Лук", "Горошек", "Майонез"));
            System.out.println("Ингредиенты для салата Оливъе: " + strings);

*/



