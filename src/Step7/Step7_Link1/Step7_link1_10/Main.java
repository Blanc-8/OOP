package Step7.Step7_Link1.Step7_link1_10;

import java.util.function.BiFunction;

/*
Write a Java program to implement a lambda expression to concatenate two strings.

Напишите программу на Java для реализации лямбда-выражения для конкатенации двух строк.
 */
public class Main {
    public static void main(String[] args) {
        String s1 = "OOOO";
        String s2 = "RRrrooog";
        String res = s1.concat(s2);
        System.out.println(res);

        BiFunction<String, String, String> concat = (str1, str2) -> str1 + str2;
        System.out.println(concat.apply(s1, s2));
    }
}
