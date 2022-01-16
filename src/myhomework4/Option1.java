package myhomework4;

public class Option1 {
    public static void main(String[] args) {
//        Есть двухмерный массив 6 строк и 6 столбцов
//        Вывести на консоль диагональ с правого верхнего угла в направлении левого нижнего
        int[][] mass = new int[6][6];
        for (int i = 0; i < mass.length; i++) {
            for (int j = mass[i].length; j >= 0; j--) {
                if (i == j) {
                    System.out.print(mass[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
//        2) Другой вариант решения:
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (i + j == mass.length) {
                    System.out.print(mass[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}
