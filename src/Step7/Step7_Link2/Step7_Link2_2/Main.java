package Step7.Step7_Link2.Step7_Link2_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Write a Java program to convert a list of strings to uppercase or lowercase using streams.

Напишите программу на Java для преобразования списка строк в верхний или нижний регистр с помощью потоков.
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("One", "two", "THREE", "FoUr", "Five");
        List<String> upperList = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperList);
        List<String> lowList = list.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println(lowList);
    }
}
