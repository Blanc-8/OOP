package Step6.Step6_Link2.Step6_Link2_1;

import java.util.ArrayList;

/*
Write a Java program to create an array list, add some colors (strings) and print out the collection.

Напишите программу на Java, которая создаст список массивов, добавит в него несколько цветов (строк) и выведет коллекцию на печать.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Черный");
        colors.add("Белый");
        colors.add("Синий");
        colors.add("Красный");
        System.out.println(colors);
    }
}
