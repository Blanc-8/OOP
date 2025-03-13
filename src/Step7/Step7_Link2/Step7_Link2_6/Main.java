package Step7.Step7_Link2.Step7_Link2_6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.

Напишите Java-программу для сортировки списка строк в алфавитном порядке, по возрастанию и убыванию с использованием потоков.
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("One", "two", "tHREE", "FoUr", "Five");
        List<String> newList1 = list.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(newList1);

        System.out.println(list.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList()));

        List<Integer> list2 = Arrays.asList(1, 8, 9, 555, 24, 8, 13, 13, 178, 179, 11, 555);
        System.out.println(list2.stream()
                .sorted()
                .collect(Collectors.toList()));

        System.out.println(list2.stream()
                .sorted((a,b) -> b.compareTo(a))
                .collect(Collectors.toList()));
    }
}
