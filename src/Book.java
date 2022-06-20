public class Book {
    private final String title;
    private int year;
    private final Author author;

    public Book(String title, int year, Author author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return author + " написал книгу " + title + " в " + year + " году.";
    }

    @Override
    public boolean equals(Object obj) {
        try {
            Book inObj = (Book) obj;
            return title.equals(inObj.getTitle()) && inObj.getYear() == year;
        } catch (ClassCastException e) {
            System.out.println("Классы не совпадают");
            return false;
        }
    }

    @Override
    public int hashCode() {
        return author.hashCode() + title.hashCode() / year;
    }
}
