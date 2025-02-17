package Step6.Step6_Link1.Step6_Link1_3fail;

/*
Write a Java program to print the following grid.

Напишите программу на Java для печати следующей сетки.
 */
public class Main {
    // Интересная конструкция, в целом понимаю как работает, но не понимаю где и когда применять такие штуки.
    public static void main(String[] args) {
        int[][] a = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%2d", a[i][j]);
            }
            System.out.println();
        }
    }
}
