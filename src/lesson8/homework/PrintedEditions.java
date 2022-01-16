package lesson8.homework;

public class PrintedEditions {
    private String name;
    private int theYearOfPublishing;
    private String publishingHouse;
    private int numberOfPages;

    public PrintedEditions() {
        super();

    }

    public PrintedEditions(String name, int theYearOfPublishing, String publishingHouse) {
        super();
        this.name = name;
        this.theYearOfPublishing = theYearOfPublishing;
        this.publishingHouse = publishingHouse;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTheYearOfPublishing() {
        return theYearOfPublishing;
    }

    public void setTheYearOfPublishing(int theYearOfPublishing) {
        this.theYearOfPublishing = theYearOfPublishing;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrintedEditions that = (PrintedEditions) o;

        if (theYearOfPublishing != that.theYearOfPublishing) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return publishingHouse != null ? publishingHouse.equals(that.publishingHouse) : that.publishingHouse == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + theYearOfPublishing;
        result = 31 * result + (publishingHouse != null ? publishingHouse.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PrintedEditions{" +
                "name='" + name + '\'' +
                ", theYearOfPublishing=" + theYearOfPublishing +
                ", publishingHouse='" + publishingHouse + '\'' +
                '}';
    }
}
