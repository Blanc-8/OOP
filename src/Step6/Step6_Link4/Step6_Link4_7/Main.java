package Step6.Step6_Link4.Step6_Link4_7;

import java.util.HashMap;
import java.util.Map;

/*
Write a Java program to test if a map contains a mapping for the specified key.

Напишите Java-программу для проверки, содержит ли карта отображение для указанного ключа.
 */
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ололо", 11);
        map.put("раш", 13);
        map.put("по", 28);
        map.put("центру", 8);
        System.out.println(map.containsKey("по"));
        System.out.println(map.containsKey("ljljlj"));
    }
}
