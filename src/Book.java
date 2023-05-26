public class Book {
    private Author authorName;
    private String bookName;
    private int publishingYear;

    public Book(Author author, String book, int year) {
        this.authorName = author;
        this.bookName = book;
        this.publishingYear = year;

    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthorName() {
        return this.authorName;
    }
    public String setAuthorName(String authorName) {
        return authorName;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

}
