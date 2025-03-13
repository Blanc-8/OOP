package Step7.Step7_Link2.Step7_Link2_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Write a Java program to count the number of strings in a list that start with a specific letter using streams.

Напишите Java-программу для подсчета количества строк в списке, начинающихся с определенной буквы, используя потоки.
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("One", "two", "tHREE", "FoUr", "Five");
       List<String> newList = list.stream()
                .filter(s -> s.startsWith("t"))
                .collect(Collectors.toList());
        System.out.println(newList.size());

        System.out.println(list.stream()
                .filter(s -> s.startsWith("t"))
                .count());
    }
}
