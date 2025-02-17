package Step6.Step6_Link2.Step6_Link2_5;

import java.util.ArrayList;

/*
Write a Java program to update an array element by the given element.

Напишите Java-программу для обновления элемента массива на заданный элемент.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Черный");
        colors.add("Белый");
        colors.add("Синий");
        colors.add("Красный");
        colors.set(0, "Фиолетовый");
        System.out.println(colors);
    }
}
