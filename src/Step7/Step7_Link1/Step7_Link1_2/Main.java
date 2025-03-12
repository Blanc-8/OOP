package Step7.Step7_Link1.Step7_Link1_2;

import java.util.function.Predicate;

/*
Write a Java program to implement a lambda expression to check if a given string is empty.

Напишите программу на Java для реализации лямбда-выражения, проверяющего, является ли заданная строка пустой.
 */
public class Main {
    public static void main(String[] args) {
        Predicate<String> isNull = s -> s.isEmpty();
        Predicate<String> isNull2 = String::isEmpty;
        System.out.println(isNull.test(""));
        System.out.println(isNull.test("Олололо"));
        System.out.println(isNull2.test(""));
        System.out.println("ttt".isEmpty());
    }
}
