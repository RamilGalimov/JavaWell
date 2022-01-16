package lesson8.homework;

public class Magazines extends PrintedEditions {
    private int numberPerYear;

    public Magazines() {

    }

    public Magazines(int numberPerYear, String name, int theYearOfPublishing, String publishingHouse, int numberOfPages
    ) {
        super(name, theYearOfPublishing, publishingHouse);
        this.numberPerYear = numberPerYear;
        this.setNumberOfPages(numberOfPages);

    }

    public int getNumberPerYear() {
        return numberPerYear;
    }

    public void setNumberPerYear(int numberPerYear) {
        this.numberPerYear = numberPerYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Magazines magazines = (Magazines) o;

        return numberPerYear == magazines.numberPerYear;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numberPerYear;
        return result;
    }

    @Override
    public String toString() {
        return "Magazines{" +
                "numberPerYear=" + numberPerYear +
                '}';
    }
}
