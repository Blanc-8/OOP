package Step6.Step6_Link1.Step6_Link1_4;

/*
Write a Java program to calculate the average value of array elements.

Напишите программу на Java для вычисления среднего значения элементов массива.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = {2, 8, 9, 63, 5, 4, 8, 5, -55, 87, 89};
        if (array.length == 0) {
            System.out.println("Массив пуст");
        } else {
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            System.out.println(sum / array.length);
        }
    }
}
