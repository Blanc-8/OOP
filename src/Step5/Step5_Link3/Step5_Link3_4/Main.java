package Step5.Step5_Link3.Step5_Link3_4;

import java.io.File;
import java.util.Scanner;

/*
Write a Java program that reads a list of numbers from a file and throws an exception if any of the numbers are positive.

Напишите программу на Java, которая считывает список чисел из файла и выбрасывает исключение, если какое-либо из чисел положительно.
 */
public class Main {
    public static void main(String[] args) {
        try {
            readNumbers("C:\\Users\\Admin.DESKTOP-7G3NSBA\\Desktop\\Java\\OOP\\OOP\\src\\Step5\\Step5_Link3_4\\numbers.txt");
        } catch (Exception e) {
            System.out.println("Найдено положительное число. Из блока catch... " + e.getMessage());
        }

    }
    public static void readNumbers(String fileName) throws Exception {
        Scanner scanner = new Scanner(new File(fileName));
        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            if (number > 0) {
                throw new Exception("Найдено положительное число: " + number);
            }
        }
    }
}
