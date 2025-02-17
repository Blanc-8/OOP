package Step5.Step5_Link4.Step5_Link4_5;
/*
Write a Java program that defines an enum called "Months" with constants representing the months of the year.

Напишите программу на Java, которая определяет перечисление «Months» с константами, представляющими месяцы года.
 */
public class Main {
    public enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    public static void main(String[] args) {
        Month month = Month.APRIL;
        System.out.println("Месяц " + month);
    }
}
