package Step6.Step6_Link1.Step6_Link1_2;

/*
Write a Java program to sum values of an array.

Напишите программу на Java для суммирования значений массива.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {5, 8, 99, 6, 2, 74, 11, 5, 6};
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println(sum);
    }
}
