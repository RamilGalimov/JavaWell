package lesson9;

public class Matrix implements IMatrix {
    private double[][] numbers;

    public Matrix(int rows, int cols) {
        numbers = new double[rows][cols];
    }

    public Matrix(double[][] numbers) {
        this.numbers = numbers;
    }

    @Override
    public int getRows() {
        return numbers.length;
    }

    @Override
    public int getColumns() {
        return this.numbers[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (this.getRows() <= rowIndex) {
            System.out.println("У нас нет такого количества строк!!!");
            return -1;
        }

        if (this.getColumns() <= colIndex) {
            System.out.println("У нас нет такого количества колонок!!!");
            return -1;
        }
        return this.numbers[rowIndex][colIndex];

    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (this.getRows() <= rowIndex) {
            System.out.println("У нас нет такого количества строк!!!");
            return;
        }

        if (this.getColumns() <= colIndex) {
            System.out.println("У нас нет такого количества колонок!!!");
            return;
        }

        this.numbers[rowIndex][colIndex] = value;

    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
//        this-matrix1
//        otherMatrix-matrix2
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Матрицы складывать нельзя! Количество строк не совпадает");
            return null;
        }

        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Матрицы складывать нельзя! Количество колонок не совпадает");
        }

        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }

        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Матрицы отнимать нельзя! Количество строк не совпадает");
            return null;
        }

        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Матрицы отнимать нельзя! Количество колонок не совпадает");
        }

        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getColumns()) {
            System.out.println("Матрицы умножать нельзя! Количество строк 1-й матрицы и количество столбцов 2-й матрицы не совпадают");
            return null;
        }

        if (this.getColumns() != otherMatrix.getRows()) {
            System.out.println("Матрицы умножать нельзя! Количество столбцов 1-й матрицы и количество строк 2-й матрицы не совпадают");
        }

        if (otherMatrix == null) {
            System.out.println("Матрицы умножать нельзя, т.к 2-я матрица- это пустота!");
        }

        Matrix result = new Matrix(this.getRows(), otherMatrix.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < otherMatrix.getColumns(); j++) {
                for (int k = 0; k < otherMatrix.getColumns(); k++) {
                    result.setValueAt(i, j, this.getValueAt(i, k) * otherMatrix.getValueAt(j, k));
                }

            }
        }
        return result;
    }

    @Override
    public IMatrix mul(double value) {
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) * value);
            }
        }
        return result;
    }

    @Override
    public IMatrix transpose() {

        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < getColumns(); j++) {
                result.setValueAt(j, i, getValueAt(i, j));
            }
        }
        return null;
    }

    @Override
    public Matrix fillMatrix(double value) {
        Matrix result = new Matrix(getRows(), getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result.setValueAt(i, j, value);
            }
        }
        return result;

    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (numbers[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }

    @Override
    public boolean isIdentityMatrix() {

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (i == j) {
                    if (numbers[i][j] != 1) {
                        return false;
                    }
                } else {
                    if (numbers[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;

    }

    @Override
    public boolean isSquareMatrix() {
        if (this.getRows() == this.getColumns()) {
            return true;
        }
        return false;
    }


    @Override
    public void printToConsole() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                System.out.print(this.getValueAt(i, j) + " ");
            }
            System.out.println();
        }

    }
}
