package Step6.Step6_Link4.Step6_Link4_4;

import java.util.HashMap;
import java.util.Map;
/*
Write a Java program to remove all mappings from a map.

Напишите программу на Java для удаления всех отображений из карты.
 */
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ололо", 11);
        map.put("раш", 13);
        map.put("по", 28);
        map.put("центру", 8);
        map.clear();
        System.out.println(map);
    }
}
