package Step5.Step5_Link4.Step5_Link4_4;
/*
Write a Java program to implement an enum called "Direction" with constants
representing the cardinal directions (North, South, East, West).

Напишите программу на Java для реализации перечисления «Direction» с константами,
представляющими кардинальные направления (Север, Юг, Восток, Запад).
 */
public class Main {
    public enum Direction {
        NORTH,
        SOUTH,
        EAST,
        WEST
    }

    public static void main(String[] args) {
        Direction direction1 = Direction.EAST;
        Direction direction2 = Direction.NORTH;
        Direction direction3 = Direction.SOUTH;
        Direction direction4 = Direction.WEST;
        System.out.println("Направление: " + direction1);
        System.out.println("Направление: " + direction2);
        System.out.println("Направление: " + direction3);
        System.out.println("Направление: " + direction4);
    }
}
