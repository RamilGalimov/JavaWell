package myhomework4;

public class Option2 {
    public static void main(String[] args) {
//        Есть двухмерный массив 6 строк и 6 столбцов
//        Вывести на консоль числа в шахматном порядке
        int[][] mass = new int[6][6];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(mass[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}
