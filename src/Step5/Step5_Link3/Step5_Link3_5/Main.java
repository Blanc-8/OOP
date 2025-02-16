package Step5.Step5_Link3.Step5_Link3_5;

import java.io.File;
import java.util.Scanner;

/*
Write a Java program that reads a file and throws an exception if the file is empty.

Напишите программу на Java, которая считывает файл и выбрасывает исключение, если файл пуст.
 */
public class Main {
    public static void main(String[] args) {
        try {
            method(new File("C:\\Users\\Admin.DESKTOP-7G3NSBA\\Desktop\\Java\\OOP\\OOP\\src\\Step5\\Step5_Link_3_5\\example.txt)"));
        } catch (Exception e) {
            System.out.println("Файл пустой");
        }

    }

    public static void method (File fileName) throws Exception {
        Scanner file = new Scanner(fileName);
        if (!file.hasNext()) {
            file.close();
            throw new Exception("Файл пуст");
        }
    }

}
