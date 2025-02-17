package Step6.Step6_Link3.Step6_Link3_4;

import java.util.HashSet;
import java.util.Set;

/*
Write a Java program to empty an hash set.

Напишите программу на Java для опустошения хэш-множества.
 */
public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(11);
        set.add(47);
        set.add(88);
        set.clear();
        System.out.println(set.size());
    }
}
