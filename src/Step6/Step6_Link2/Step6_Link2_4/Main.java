package Step6.Step6_Link2.Step6_Link2_4;

import java.util.ArrayList;

/*
Write a Java program to insert an element into the array list at the first position.

Напишите Java-программу для вставки элемента в список массива в первой позиции.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Черный");
        colors.add("Белый");
        colors.add("Синий");
        colors.add("Красный");
        colors.add(0, "Прозрачный");
        System.out.println(colors);
    }
}
