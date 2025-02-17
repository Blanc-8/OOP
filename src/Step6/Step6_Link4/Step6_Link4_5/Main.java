package Step6.Step6_Link4.Step6_Link4_5;

import java.util.HashMap;
import java.util.Map;

/*
Write a Java program to check whether a map contains key-value mappings (empty) or not.

Напишите программу на Java для проверки того, содержит ли карта сопоставления ключ-значение (пустая) или нет.
 */
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ололо", 11);
        map.put("раш", 13);
        map.put("по", 28);
        map.put("центру", 8);
        System.out.println(map.isEmpty());
        map.clear();
        System.out.println(map.isEmpty());
    }
}
