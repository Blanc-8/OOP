package Step5.Step5_Link2.Step5_Link2_1_test;
/*
Write a Java program to create a generic method that takes two arrays of the same type and checks
if they have the same elements in the same order.

Напишите программу на Java для создания общего метода,
который принимает два массива одного типа и проверяет, есть ли в них одинаковые элементы в одном и том же порядке.
 */
import java.util.Arrays;
/*
Решение полностью списано так как тема даётся тяжеловато. Пытаюсь мэтчить в голове условия задачи решения.
 */
public class ArrayCompare {
    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4};
        Integer[] arr2 = {1, 2, 4, 4};
        Integer[] arr3 = {1, 2, 3, 4};
        String[] arr4 = {"Java", "World"};
        String[] arr5 = {"JavaScript", "World"};
        String[] arr6 = {"Java", "World"};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr5));
        System.out.println(compareArrays(arr1, arr2));
        System.out.println(compareArrays(arr1, arr3));
        System.out.println(compareArrays(arr4, arr5));
        System.out.println(compareArrays(arr4, arr6));
    }
}
