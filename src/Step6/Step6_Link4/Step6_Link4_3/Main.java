package Step6.Step6_Link4.Step6_Link4_3;

import java.util.HashMap;
import java.util.Map;

/*
Write a Java program to copy all mappings from the specified map to another map.

Напишите программу на Java для копирования всех отображений из указанной карты в другую карту.
 */
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ололо", 11);
        map.put("раш", 13);
        map.put("по", 28);
        map.put("центру", 8);

        HashMap<String, Integer > map2 = new HashMap<>();
        map2.putAll(map);
        System.out.println(map2);
    }
}
