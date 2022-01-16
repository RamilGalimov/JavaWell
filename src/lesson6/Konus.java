package lesson6;

public class Konus {
    private int radiusKonusa;
    private int lKonusa;

    public void setRadiusKonusa(int radiusKonusa) {
        this.radiusKonusa = radiusKonusa;
    }

    public void setlKonusa(int lKonusa) {
        this.lKonusa = lKonusa;
    }

    public int perimetr() {
        return (2 * lKonusa) + (2 * radiusKonusa);
    }

    public double ploshad() {
        return (Math.PI * (radiusKonusa * radiusKonusa)) + (Math.PI * radiusKonusa * lKonusa);
    }
}
