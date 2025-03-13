package Step7.Step7_Link2.Step7_Link2_3;

import java.util.Arrays;
import java.util.List;

/*
Write a Java program to calculate the sum of all even, odd numbers in a list using streams.

Напишите программу на Java для вычисления суммы всех четных и нечетных чисел в списке с помощью потоков.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 8, 9, 555, 24, 8, 13, 13, 178, 179, 11, 555);
        int sum1 = list.stream()
                .filter(i -> i % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum1);

        int sum2 = list.stream()
                .filter(i -> i % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum2);
    }
}
