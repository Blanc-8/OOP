package Step7.Step7_Link2.Step7_Link2_1;

import java.util.Arrays;
import java.util.List;

/*
Write a Java program to calculate the average of a list of integers using streams.

Напишите Java-программу для вычисления среднего значения списка целых чисел с помощью потоков.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 8, 9, 555, 24, 8, 13, 13, 178, 179, 11, 555);
        double sredn = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println(sredn);
    }
}
