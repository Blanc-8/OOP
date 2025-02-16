package Step5.Step5_Link2.Step5_Link2_5;

import java.util.ArrayList;
import java.util.List;

/*
Write a Java program to create a generic method
that takes two lists of the same type and merges them into a single list. This method alternates the elements of each list.

Напишите программу на Java для создания общего метода,
который берет два списка одного типа и объединяет их в один список. Этот метод чередует элементы каждого списка.
 */
public class Main {
    public static <T> List <T> marges (List<T> list1, List<T> list2) {
        List<T> newList = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            newList.add(list1.get(i));
            newList.add(list2.get(i));
        }
        return newList;
    }

    public static void main(String[] args) {
        List<Integer> integers1 = List.of(1, 2, 3, 4, 5);
        List<Integer> integers2 = List.of(11, 12, 13, 14, 15);
        List<String> strings1 = List.of("Drum", "and", "Bass");
        List<String> strings2 = List.of("Hip", "Hop", "Java");
        System.out.println(marges(integers1,integers2));
        System.out.println(marges(strings1,strings2));
    }
}
