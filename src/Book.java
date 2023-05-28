public class Book {
    public Author author;
    public String bookName;
    public int publishingYear;

    public Book(Author author, String book, int year) {
        this.author = author;
        this.bookName = book;
        this.publishingYear = year;

    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public int setPublishingYear(int year) {
        return this.publishingYear = year;

    }


    void printBook() {
        System.out.println("Автор: " + getAuthor() + " Название книги: " + getBookName() + " Изданна в: " + getPublishingYear());

    }
}
