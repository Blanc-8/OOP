package Step6.Step6_Link1.Step6_Link1_7;

import java.util.Arrays;

/*
Write a Java program to remove a specific element from an array.

Напишите программу на Java для удаления определенного элемента из массива.
 */
public class Main {
    // чутка кривовато вышло, плюс в задании имелось ввиду удаление по индексу, а я пытался вспомнить реальзацию удаления по значению
    public static void remove (int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                for (int j = i; j < array.length ; j++) {
                    array[i] = array[i+1];
                }
                array[array.length-1] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] array1 = {2, 8, 9, 63, 5, 4, 8, 5, -55, 87, 89};
        System.out.println(Arrays.toString(array1));
        remove(array1, -55);
        System.out.println(Arrays.toString(array1));
    }
}
