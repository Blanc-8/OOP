package Step5.Step5_Link2.Step5_Link2_7;

import java.util.HashMap;
import java.util.Map;

/*
Write a Java program to create a generic method that takes a map of any type and prints each key-value pair.

Напишите программу на Java для создания общего метода, который принимает карту любого типа и выводит каждую пару ключ-значение.
 */
public class Main {
    // Возникли небольшие трудности с вложенным интерфейсом Entry и его реализации. Ранее просто не знал, что это есть и как пользоваться.
        public static <K , V> void mapping (Map<K, V> map) {
            for (Map.Entry <K, V> entry : map.entrySet()) {
                K key = entry.getKey();
                V value = entry.getValue();
                System.out.println("Ключ: " + key + " Значение: " + value);
            }
        }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Hip", 1);
        map.put("Hop", 2);
        map.put("Dnb", 4);
        mapping(map);
    }
}
