package Step6.Step6_Link1.Step6_Link1_6;
/*
Write a Java program to find the index of an array element.

Напишите программу на Java для нахождения индекса элемента массива.
 */
public class Main {
    public static int getIndex(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array1 = {2, 8, 9, 63, 5, 4, 8, 5, -55, 87, 89};
        System.out.println(getIndex(array1, 5));
    }
}
