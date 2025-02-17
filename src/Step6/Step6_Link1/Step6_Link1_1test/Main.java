package Step6.Step6_Link1.Step6_Link1_1test;

import java.util.Arrays;

/*
Write a Java program to sort a numeric array and a string array.

Напишите программу на Java для сортировки числового массива и массива строк.
 */
public class Main {
    // Списал с ответов так как из задачи не понял что хотят от меня. + после задачи обзавёлся шпорами по интерфейсам коллекций.
    public static void main(String[] args) {
        int[] array1 = {1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};

        String[] array2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
