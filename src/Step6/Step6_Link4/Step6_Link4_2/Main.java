package Step6.Step6_Link4.Step6_Link4_2;

import java.util.HashMap;
import java.util.Map;

/*
Write a Java program to count the number of key-value (size) mappings in a map.

Напишите программу на Java для подсчета количества сопоставлений ключ-значение (размер) в карте.
 */
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ололо", 11);
        map.put("раш", 13);
        map.put("по", 28);
        map.put("центру", 8);
        System.out.println(map.size());
    }
}
