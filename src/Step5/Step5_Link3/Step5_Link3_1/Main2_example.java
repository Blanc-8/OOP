package Step5.Step5_Link3.Step5_Link3_1;

public class Main2_example {
    public static void main(String[] args) {
        try {
            int result = divideNumbers(5, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    public static int divideNumbers(int number1, int number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Нельзя делить на 0");
        }
        return number1 / number2;
    }
}
