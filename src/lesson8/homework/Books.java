package lesson8.homework;

public class Books extends PrintedEditions {
    private String author;

    public Books() {

    }

    public Books(String author, int numberOfPages, String name, int theYearOfPublishing, String publishingHouse) {
        super(name, theYearOfPublishing, publishingHouse);
        this.author = author;
        this.setNumberOfPages(numberOfPages);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Books books = (Books) o;

        return author != null ? author.equals(books.author) : books.author == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (author != null ? author.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Books{" +
                "author='" + author + '\'' +
                '}';
    }
}
