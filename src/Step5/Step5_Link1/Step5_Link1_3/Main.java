package Step5.Step5_Link1.Step5_Link1_3;
/*
Write a Java program to create a class called "Initializer" with a static block
that initializes a static variable 'initialValue' to 1000.
Print the value of 'initialValue' before and after creating an instance of "Initializer".

Напишите программу на Java для создания класса «Initializer» со статическим блоком,
который инициализирует статическую переменную 'initialValue' до значения 1000.
Выведите значение 'initialValue' до и после создания экземпляра «Initializer».
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Initializer.getInitialValue());
        Initializer initializer = new Initializer();
        System.out.println(Initializer.getInitialValue());

        /*
        Судя по ответу, у меня такое же решение, только я инициализацию произвёл при объявлении переменной,
        но проверь плиз, может что-то сделал не так, ответ на задачу:
        https://www.w3resource.com/java-exercises/static_members/java-static-members-exercise-3.php
         */

    }
}
