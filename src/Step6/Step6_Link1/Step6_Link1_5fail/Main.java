package Step6.Step6_Link1.Step6_Link1_5fail;

/*
Write a Java program to test if an array contains a specific value.

Напишите программу на Java для проверки того, содержит ли массив определенное значение.
 */
public class Main {

    // не смог решить без ответов
    public static boolean contains(int[] array, int number) {
        for (int i : array) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] array1 = {2, 8, 9, 63, 5, 4, 8, 5, -55, 87, 89};
        System.out.println(contains(array1, 100));
    }
}
