package Step7.Step7_Link1.Step7_Link1_4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.

Напишите программу на Java для реализации лямбда-выражения, отсеивающего четные и нечетные числа из списка целых чисел.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 8, 9, 555, 24, 13, 178, 179, 11);
        List<Integer> chet = list.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(chet);
        List<Integer> neChet = list.stream()
                .filter(i -> i % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(neChet);
    }
}
