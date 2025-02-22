package Step6.Step6_Link1.Step6_Link1_7;

import java.util.ArrayList;
import java.util.Arrays;

/*
Напишите программу на Java для удаления определенного элемента из массива.
 */
public class Main2 {
    public static void remove (int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                for (int j = i; j < arr.length -1; j++) {
                    arr[j] = arr[j +1];
                }
                arr[arr.length - 1] = 0;
                i--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5 , 8, 8, 10 , 55, -8, 7};
        remove(arr, 8);
        System.out.println(Arrays.toString(arr));
    }
}
