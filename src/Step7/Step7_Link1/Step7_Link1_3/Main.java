package Step7.Step7_Link1.Step7_Link1_3;

import java.util.Arrays;
import java.util.List;

/*
Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.

Напишите программу на Java, реализующую лямбда-выражение для преобразования списка строк в верхний и нижний регистр.
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("One", "two", "THREE", "FoUr", "Five");
        list.replaceAll(String::toUpperCase);
        System.out.println(list);
        list.replaceAll(String::toLowerCase);
        System.out.println(list);

    }
}
