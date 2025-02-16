package Step4.Step4_Link7.Step4_Link7_5;
/*
Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo().
Create subclasses Manager and Programmer that extend the Employee class and implement the respective methods
to calculate salary and display information for each role.

  Напишите программу на Java для создания абстрактного класса Employee с абстрактными методами calculateSalary() и displayInfo().
  Создайте подклассы Manager и Programmer, которые расширяют класс Employee и реализуют соответствующие методы
  для расчета зарплаты и отображения информации для каждой роли.
 */
public class Main {
    // После своего решения пришлось переписывать в соответствии с решением на сайте.
    // Только оттуда понял механику расчёта зп для спецов.
    public static void main(String[] args) {
        Manager manager = new Manager("manager", 10_000, 5_000);
        Programmer programmer = new Programmer("programmer", 25_000, 10);
        manager.calculateSalary();
        manager.displayInfo();
        programmer.calculateSalary();
        programmer.displayInfo();
    }

}
