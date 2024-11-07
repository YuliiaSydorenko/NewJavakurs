package homeworksss.homework38.integercomparators;

import java.util.Arrays;
import java.util.Comparator;

public class Task2 {
   

    public static void main(String[] args, int int2, int int1) {


        Integer[] integers = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};
        // Сортировка массива с использованием компаратора
        //[2, 4, 6, 8, 1, 3, 5, 7, 7, 9] // Output



        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer int1, Integer int2) {


                boolean isFirstEven = int1 % 2 == 0;
                boolean isSecondEven = int2 % 2 == 0;
                if (isFirstEven && !isSecondEven) {
                    return -1;

                } else if (!isFirstEven && isSecondEven) {
                    return 1;

                } else {

                    return Integer.compare(int1, int2);
                }
            }

            };
        Arrays.sort(integers, comparator);
        System.out.println(Arrays.toString(integers));
        
        


        }

    private static int compare(Integer int1, Integer int2) {
        boolean isFirstEven = int1 % 2 == 0;
        boolean isSecondEven = int2 % 2 == 0;
        if (isFirstEven && !isSecondEven) {
            return Integer.compare(int1, int2);
        } else if (isFirstEven) {
            return -1;
        } else if (isSecondEven) {
            return 1;
        } else {
            return Integer.compare(int2, int1);

        }
    }
}
    

