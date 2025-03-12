package Step7.Step7_Link1.Step7_Link1_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
Write a Java program to implement a lambda expression to find the maximum and minimum values in a list of integers.

Напишите программу на Java, реализующую лямбда-выражение для поиска максимального и минимального значений в списке целых чисел.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 8, 9, 555, 24, 8, 13, 13, 178, 179, 11, 555);
        List<Integer> list2 = new ArrayList<>();
        Optional<Integer> minList = list.stream()
                .min(Integer::compareTo);
        System.out.println(minList.orElse(-999));

        Optional<Integer> maxList = list2.stream()
                .max(Integer::compareTo);
        System.out.println(maxList.orElse(-999));
    }
}
