package Step6.Step6_Link3.Step6_Link3_5;

import java.util.HashSet;
import java.util.Set;

/*
Write a Java program to test if a hash set is empty or not.

Напишите программу на Java для проверки того, является ли хэш-множество пустым или нет.
 */
public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(11);
        set.add(47);
        set.add(88);
        System.out.println(set.isEmpty());
        set.clear();
        System.out.println(set.isEmpty());
    }
}
