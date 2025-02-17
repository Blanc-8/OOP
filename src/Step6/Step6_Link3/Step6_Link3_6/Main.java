package Step6.Step6_Link3.Step6_Link3_6;

import java.util.HashSet;
import java.util.Set;

/*
Write a Java program to clone a hash set to another hash set.

Напишите программу на Java для клонирования хэш-набора в другой хэш-набор.
 */
public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(11);
        set1.add(47);
        set1.add(88);

        Set<Integer> set2 = new HashSet<>();
        set2.addAll(set1);
        System.out.println(set2);
    }
}
