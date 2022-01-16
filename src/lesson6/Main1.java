package lesson6;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Выберите фигуру, которую хотите посчитать");
        System.out.println("1-треугольник");
        System.out.println("2-круг");
        System.out.println("3-параллелепипед");
        System.out.println("4-овал");
        System.out.println("5-конус");

        Scanner scanner = new Scanner(System.in);
        int selectedFigura = scanner.nextInt();
        switch (selectedFigura) {
            case 1:
                System.out.println("Введите сторону А:");
                int a = scanner.nextInt();
                System.out.println("Введите сторону B:");
                int b = scanner.nextInt();
                System.out.println("Введите сторону C:");
                int c = scanner.nextInt();
                Treugolnik treugolnik = new Treugolnik();
                treugolnik.setA(a);
                treugolnik.setB(b);
                treugolnik.setC(c);
                if (treugolnik.ploshad() != -1) {
                    System.out.println("Площадь треугольника:" + treugolnik.ploshad());
                    System.out.println("Периметр треугольника:" + treugolnik.perimetr());
                }
                break;
            case 2:
                System.out.println("Введите радиус круга:");
                int radius = scanner.nextInt();
                Krug krug = new Krug();
                krug.setRadius(radius);
                System.out.println("Периметр круга:" + krug.perimetr());
                System.out.println("Площадь круга:" + krug.ploshad());
                break;
            case 3:
                System.out.println("Введите сторону L:");
                int l = scanner.nextInt();
                System.out.println("Введите сторону T:");
                int t = scanner.nextInt();
                System.out.println("Введите сторону D:");
                int d = scanner.nextInt();
                Parallelepiped parallelepiped = new Parallelepiped();
                parallelepiped.setL(l);
                parallelepiped.setT(t);
                parallelepiped.setD(d);
                System.out.println("Площадь параллелепипеда:" + parallelepiped.ploshad());
                System.out.println("Периметр параллелепипеда:" + parallelepiped.perimetr());
                break;
            case 4:
                System.out.println("Введите сторону M:");
                int m = scanner.nextInt();
                System.out.println("Введите сторону N:");
                int n = scanner.nextInt();
                Oval oval = new Oval();
                oval.setM(m);
                oval.setN(n);
                System.out.println("Площадь овала:" + oval.ploshad());
                System.out.println("Периметр овала:" + oval.perimetr());
                break;
            case 5:
                System.out.println("Введите радиус конуса:");
                int radiusKonusa = scanner.nextInt();
                System.out.println("Введите образующую конуса L:");
                int lKonusa = scanner.nextInt();
                Konus konus = new Konus();
                konus.setRadiusKonusa(radiusKonusa);
                konus.setlKonusa(lKonusa);
                System.out.println("Периметр конуса:" + konus.perimetr());
                System.out.println("Площадь конуса:" + konus.ploshad());
                break;
            default:
                System.out.println("Такой фигуры у нас пока нет");
        }
    }
}
