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
        this.authorName = authorName;
        return null;
    }
    public String setAuthorName(String authorName) {
        return authorName;
    }

    public int getPublishingYear() {
       this.publishingYear = publishingYear;
        return publishingYear;
    }

    void printBook() {
        System.out.println("Автор: " + getAuthorName() + " Название книги: " + getBookName() + " Изданна в: " + getPublishingYear());
    }
}
