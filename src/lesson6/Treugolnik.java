package lesson6;

public class Treugolnik {
    //    1-преременные, которые описывают состояние объекта (характеристики)
//    поля класса
    private int a;
    private int b;
    private int c;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int perimetr() {
        if (a > b + c || b > a + c || c > a + b) {
            System.out.println("Такого треугольника не существует!");
            return -1;
        }
        return this.a + this.b + this.c;
    }

    public double ploshad() {
        if (a > b + c || b > a + c || c > a + b) {
            System.out.println("Такого треугольника не существует!");
            return -1;
        }

        int p = this.perimetr() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
