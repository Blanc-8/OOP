package Step5.Step5_Link3.Step5_Link3_3;

import java.io.File;
import java.io.FileNotFoundException;

/*
Write a Java program to create a method that reads a file and throws an exception if the file is not found.

Напишите программу на Java для создания метода, который считывает файл и выбрасывает исключение, если файл не найден.
 */
public class Main {
// с помощью гпт удалось разобраться и собрать задачку
    public static void main(String[] args) throws Exception {
        try {
            readFile("Example.txt");
        } catch (Exception e) {
            System.out.println("Неверное имя файла. " + e.getMessage());
        }
    }
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException("Файл не найден: " + fileName);
        }
    }

}
