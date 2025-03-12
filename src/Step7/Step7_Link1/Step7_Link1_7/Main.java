package Step7.Step7_Link1.Step7_Link1_7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
Write a Java program to implement a lambda expression to remove duplicates from a list of integers.

Напишите программу на Java, реализующую лямбда-выражение для удаления дубликатов из списка целых чисел.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 8, 9, 555, 24, 8, 13, 13, 178, 179, 11, 555);
        Set<Integer> set = list.stream()
                .collect(Collectors.toSet());
        Set<Integer> set2 = new HashSet<>(list);
        System.out.println(set);
        System.out.println(set2);

        List<Integer> list2 = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(list2);
    }
}
