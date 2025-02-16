package Step5.Step5_Link2.Step5_Link2_4;

import java.util.ArrayList;
import java.util.List;

/*
Write a Java program to create a generic method
that takes a list of any type and returns it as a new list with the elements in reverse order.

Напишите программу на Java для создания общего метода,
который принимает список любого типа и возвращает его в виде нового списка с элементами в обратном порядке.
 */
public class Main {

    // Писал сам, всё получилось! Но оригинальное решение чуть отличается, дай плиз коммент почему и как лучше
    // https://www.w3resource.com/java-exercises/generic/java-generic-exercise-4.php
    public static <T> void inverse(List<T> list) {
        List<T> list2 = new ArrayList<>();
        for (int i = list.size() -1; i >= 0 ; i--) {
            list2.add(list.get(i));
        }
        System.out.println(list2);
    }

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);
        List<String> strings = List.of("Hip", "Hop", "DnB");
        inverse(integers);
        inverse(strings);
    }
}
