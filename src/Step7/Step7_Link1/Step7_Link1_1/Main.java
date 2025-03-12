package Step7.Step7_Link1.Step7_Link1_1;
/*
Write a Java program to implement a lambda expression to find the sum of two integers.

Напишите программу на Java для реализации лямбда-выражения для нахождения суммы двух целых чисел.
 */
public class Main {
    public static void main(String[] args) {
        SumCalc sumCalc = ((a, b) -> a + b);
        SumCalc sumCalc2 = (Integer::sum);
        System.out.println(sumCalc.sum(5,30));
        System.out.println(sumCalc2.sum(5,-30));
    }
    }
