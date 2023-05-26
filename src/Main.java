public class Main {

    public static void main(String[] args) {

        Author author = new Author("Говарда", "Лавкрафта");
        Book theMountainsOfMadness = new Book( author,"Хребет безумия.", 1936);
        System.out.println("Автор: " + author.foolAuthor());
        System.out.println("Автор: " + theMountainsOfMadness.getAuthorName().foolAuthor() + " Название книги: " + theMountainsOfMadness.getBookName() + " Изданна в: " + theMountainsOfMadness.getPublishingYear());
        Author author1 = new Author("Джордж", "Оруэлл");
        Book nineteenEightyFour = new Book( author1, "1984.",1949);
        System.out.println("Автор: " + author1.foolAuthor());
        System.out.println("Автор: " + nineteenEightyFour.getAuthorName().foolAuthor() + " Название книги: " + nineteenEightyFour.getBookName() + " Изданна в: " + nineteenEightyFour.getPublishingYear());

    }
}