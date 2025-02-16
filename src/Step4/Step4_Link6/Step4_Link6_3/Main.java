package Step4.Step4_Link6.Step4_Link6_3;
/*
Write a Java program to create an interface Flyable with a method called fly_obj().
Create three classes Spacecraft, Airplane, and Helicopter that implement the Flyable interface.
Implement the fly_obj() method for each of the three classes.

Напишите программу на Java для создания интерфейса Flyable с методом fly_obj().
Создайте три класса Spacecraft, Airplane и Helicopter, которые реализуют интерфейс Flyable.
Реализуйте метод fly_obj() для каждого из трех классов.
 */
public class Main {
    public static void main(String[] args) {
        Spacecraft spacecraft = new Spacecraft();
        Airplane airplane = new Airplane();
        Helicopter helicopter = new Helicopter();
        spacecraft.flyObj();
        airplane.flyObj();
        helicopter.flyObj();

    }
}
