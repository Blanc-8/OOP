package Step5.Step5_Link2.Step5_Link2_3;

import java.util.List;

/*
Write a Java program to create a generic method that takes a list of any type and a target element.
It returns the index of the first occurrence of the target element in the list. Return -1 if the target element cannot be found.

Напишите программу на Java для создания общего метода, который принимает список любого типа и целевой элемент.
Он возвращает индекс первого вхождения целевого элемента в список. Возвращает -1, если целевой элемент не может быть найден.
 */
public class Main {

    // САМ НАПИСАЛ!!!!1111
    public static <T extends Object> int heyMethod(List<T> list, T element) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(element)) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        List<Integer> integers1 = List.of(1, 2, 3, 4, 5);
        List<String> strings = List.of("Hey", "Hop", "Hip");
        System.out.println(heyMethod(integers1, 2));
        System.out.println(heyMethod(integers1, 5));
        System.out.println(heyMethod(integers1, 8));
        System.out.println(heyMethod(strings, "Hop"));
        System.out.println(heyMethod(strings, "Ha"));
    }

}
