package Step5.Step5_Link4.Step5_Link4_2;
/*
Write a Java program to create an enum called "Weekend" with constants representing the days of the weekend.

Напишите программу на Java для создания перечисления «Weekend» с константами, обозначающими дни выходных.
 */
public class Main {
    public enum WeekendDays {
        SUNDAY,
        SATURDAY
    }

    public static void main(String[] args) {
        WeekendDays weekend1 = WeekendDays.SUNDAY;
        WeekendDays weekend2 = WeekendDays.SATURDAY;
        System.out.println("Выходной " + weekend1);
        System.out.println("Выходной " + weekend2);
    }
}
