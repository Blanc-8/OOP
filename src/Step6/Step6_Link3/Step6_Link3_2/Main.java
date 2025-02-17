package Step6.Step6_Link3.Step6_Link3_2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Write a Java program to iterate through all elements in a hash list.

Напишите Java-программу для перебора всех элементов хэш-списка.
 */
public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(11);
        set.add(47);
        set.add(88);
        for (int s : set) {
            System.out.println(s);
        }
        // Есть вариант с перебор через итератор(в ответах), хз зачем но пусть будет
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
