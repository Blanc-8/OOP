package Step7.Step7_Link2.Step7_Link2_7;

import java.util.Arrays;
import java.util.List;

/*
Write a Java program to find the maximum and minimum values in a list of integers using streams.

Напишите программу на Java для поиска максимального и минимального значений в списке целых чисел с помощью потоков.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 8, 9, 555, 24, 8, 13, 13, 178, 179, 11, 555);

        System.out.println(list.stream()
                .min(Integer::compareTo).orElse(0));
        System.out.println(list.stream()
                .max(Integer::compareTo).orElse(0));
    }
}
