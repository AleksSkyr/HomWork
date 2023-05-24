public class Book {
    private String authorName;
    private String bookName;
    private int publishingYear;

    public Book(String author, String name, int year) {
        this.authorName = author;
        this.bookName = name;
        this.publishingYear = year;

    }

    public String getBookName() {
        return this.bookName;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getPublishingYear() {
        return this.authorName;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
