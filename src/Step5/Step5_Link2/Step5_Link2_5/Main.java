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
    public static <T> List <T> merges(List<T> list1, List<T> list2) {
        List<T> newList = new ArrayList<>();
        int minSize = Math.min(list1.size(),list2.size());
        for (int i = 0; i < minSize; i++) {
            newList.add(list1.get(i));
            newList.add(list2.get(i));
        }
        if (list1.size() > minSize) {
            newList.addAll(list1.subList(minSize, list1.size()));
        }
        if (list2.size() > minSize) {
            newList.addAll(list2.subList(minSize, list2.size()));
        }
        return newList;
    }

    public static void main(String[] args) {
        List<Integer> integers1 = List.of(1, 2, 3, 4, 5, 6, 7);
        List<Integer> integers2 = List.of(11, 12, 13, 14, 15);
        List<String> strings1 = List.of("Drum", "and", "Bass", "Boom", "Box");
        List<String> strings2 = List.of("Hip", "Hop", "Java");
        System.out.println(merges(integers1,integers2));
        System.out.println(merges(strings1,strings2));
    }
}
