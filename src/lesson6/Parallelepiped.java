package lesson6;

public class Parallelepiped {
    private int l;
    private int t;
    private int d;

    public void setL(int l) {
        this.l = l;
    }

    public void setT(int t) {
        this.t = t;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int perimetr() {
        return 4 * (l + t + d);
    }

    public double ploshad() {
        return 2 * ((l * t) + (l * d) + (t * d));
    }
}

