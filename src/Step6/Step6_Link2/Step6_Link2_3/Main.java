package Step6.Step6_Link2.Step6_Link2_3;

import java.util.ArrayList;

/*
Write a Java program to retrieve an element (at a specified index) from a given array list.

Напишите программу на Java для извлечения элемента (с заданным индексом) из заданного списка массивов.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Черный");
        colors.add("Белый");
        colors.add("Синий");
        colors.add("Красный");
         System.out.println(colors.get(2));
    }
}
