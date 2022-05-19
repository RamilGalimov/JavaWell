package lesson9;

public class Main {
    public static void main(String[] args) {
        double[][] forMatrix1 = {{3, 6, 4},
                {4, 7, 3},
                {4, 3, 4},
                {2, 6, 1},};
        double[][] forMatrix2 = {{6, 1, 1},
                {3, 5, 0},
                {9, 7, 8},
                {2, 5, 0},};
        Matrix matrix1 = new Matrix(forMatrix1);
        Matrix matrix2 = new Matrix(forMatrix2);

        IMatrix matrixAdd = matrix1.add(matrix2);
        matrixAdd.printToConsole();

        IMatrix matrixSub = matrix1.sub(matrix2);
        matrixSub.printToConsole();

        IMatrix matrixMul = matrix1.mul(matrix2);
        matrixMul.printToConsole();

        IMatrix matrix1Mul = matrix1.mul(5);
        matrix1Mul.printToConsole();

        IMatrix matrix1Transpose = matrix1.transpose();
        matrix1Transpose.printToConsole();

        IMatrix matrix1fillMatrix = matrix1.fillMatrix(5);
        matrix1fillMatrix.printToConsole();

        boolean matrix1isNullMatrix = matrix1.isNullMatrix();
        System.out.println(matrix1.isNullMatrix());

        boolean matrix1isIdentityMatrix = matrix1.isIdentityMatrix();
        System.out.println(matrix1.isIdentityMatrix());

        boolean matrix1isSquareMatrix = matrix1.isSquareMatrix();
        System.out.println(matrix1.isSquareMatrix());


    }
}
