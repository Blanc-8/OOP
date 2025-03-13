package Step7.Step7_Link2.Step7_Link2_4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Write a Java program to remove all duplicate elements from a list using streams.

Напишите Java-программу для удаления всех дублирующихся элементов из списка с помощью потоков.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 8, 9, 555, 24, 8, 13, 13, 178, 179, 11, 555);
        List<Integer> newList = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(newList);
    }
}
