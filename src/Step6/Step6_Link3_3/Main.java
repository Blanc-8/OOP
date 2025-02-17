package Step6.Step6_Link3_3;

import java.util.HashSet;
import java.util.Set;

/*
Write a Java program to get the number of elements in a hash set.

Напишите программу на Java для получения количества элементов в хэш-наборе.
 */
public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(11);
        set.add(47);
        set.add(88);
        System.out.println(set.size());
    }
}
