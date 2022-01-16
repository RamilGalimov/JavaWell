package lesson6;

public class Oval {
    private int m;
    private int n;

    public void setM(int m) {
        this.m = m;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double perimetr() {
        return 4 * (((Math.PI * m * n) + ((m - n) * (m - n))) / (m + n));
    }

    public double ploshad() {
        return Math.PI * m * n;
    }
}
