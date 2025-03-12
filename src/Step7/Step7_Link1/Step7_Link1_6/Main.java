package Step7.Step7_Link1.Step7_Link1_6;

import java.util.Arrays;
import java.util.List;

/*
Write a Java program to implement a lambda expression to find the average of a list of doubles.

Напишите программу на Java, реализующую лямбда-выражение для нахождения среднего значения из списка double.
 */
public class Main {
    public static void main(String[] args) {
        List<Double> numbers = Arrays.asList(1.5, 2.5, 3.5, 4.5);
       double number = numbers.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println(number);
    }
}
