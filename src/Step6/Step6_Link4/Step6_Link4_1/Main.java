package Step6.Step6_Link4.Step6_Link4_1;

import java.util.HashMap;
import java.util.Map;

/*
Write a Java program to associate the specified value with the specified key in a HashMap.

Напишите программу на Java, чтобы связать указанное значение с указанным ключом в HashMap.
 */
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ололо", 11);
        map.put("раш", 13);
        map.put("по", 28);
        map.put("центру", 8);
        System.out.println(map);
    }
}
