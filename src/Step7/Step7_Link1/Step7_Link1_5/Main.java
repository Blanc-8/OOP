package Step7.Step7_Link1.Step7_Link1_5;

import java.util.Arrays;
import java.util.List;

/*
Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.

Напишите программу на Java, реализующую лямбда-выражение для сортировки списка строк в алфавитном порядке.
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("One", "two", "THREE", "FoUr", "Five");
        list.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        System.out.println(list);
    }
}
