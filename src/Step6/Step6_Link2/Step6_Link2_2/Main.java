package Step6.Step6_Link2.Step6_Link2_2;

import java.util.ArrayList;

/*
Write a Java program to iterate through all elements in an array list.

Напишите Java-программу для перебора всех элементов в списке массива.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Черный");
        colors.add("Белый");
        colors.add("Синий");
        colors.add("Красный");
        for (String s : colors) {
            System.out.println(s);
        }
    }
}
