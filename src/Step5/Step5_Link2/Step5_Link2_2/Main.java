package Step5.Step5_Link2.Step5_Link2_2;

import java.util.List;

/*
Write a Java program to create a generic method that takes a list of numbers and returns the sum of all the even and odd numbers.

Напишите программу на Java для создания общего метода, который принимает список чисел и возвращает сумму всех четных и нечетных чисел.
 */
public class Main {
    /*
    Вот тут в целом правильное решение придумал, но с написанием правильных конструкций с указанием коллекции и типа пока трудности
    поэтому итог правил по ответам.
     */
    public static <T extends Number> void returnSum (List<T> array) {
        double sumChet = 0;
        double sunNeChet = 0;
        for (T number : array) {
            if (number.doubleValue() % 2 == 0) {
                sumChet += number.doubleValue();
            } else {
                sunNeChet += number.doubleValue();
            }
        }
        System.out.println("Сумма чётных: " + sumChet);
        System.out.println("Сумма не чётных: " + sunNeChet);
    }

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7);
        List<Double> doubles = List.of(2.0, 1.5, 4.5, 2.5, 1.5);
        returnSum(integers);
        returnSum(doubles);
    }
}
