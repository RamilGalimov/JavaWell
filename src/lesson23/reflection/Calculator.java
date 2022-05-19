package lesson23.reflection;

public class Calculator {
    void sum(int a, int b) {
        int res = a + b;
        System.out.println("Сумма" + a + "и" + b + "=" + res);
    }

    void subtraction(int a, int b) {
        int res = a - b;
        System.out.println("Разница" + a + "и" + b + "=" + res);
    }

    void multiplication(int a, int b) {
        int res = a * b;
        System.out.println("Сумма" + a + "и" + b + "=" + res);
    }

    void devision(int a, int b) {
        int res = a / b;
        System.out.println("Сумма" + a + "и" + b + "=" + res);
    }
}
