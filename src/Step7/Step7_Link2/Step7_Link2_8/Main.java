package Step7.Step7_Link2.Step7_Link2_8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
Write a Java program to find the second smallest and largest elements in a list of integers using streams.

Напишите Java-программу для поиска второго наименьшего и наибольшего элементов в списке целых чисел с помощью потоков.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 8, 9, 555, 24, 8, 13, 13, 178, 179, 11);
        System.out.println(list.stream()
                .sorted()
                .skip(1)
                .findFirst().orElse(0));
        System.out.println(list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().orElse(0));
    }
}
