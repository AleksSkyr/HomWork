public class Main {

    public static void main(String[] args) {
        Book AtTheMountainsOfMadness = new Book(" Говарда Филлипса Лавкрафта", "Хребет безумия", 1936);
        System.out.println("Автор: " + AtTheMountainsOfMadness.getAuthorName());
        System.out.println("Книга: " + AtTheMountainsOfMadness.getBookName());
        AtTheMountainsOfMadness.setPublishingYear(1931);
        System.out.println("Написание: " + AtTheMountainsOfMadness.setPublishingYear());
        System.out.println("Год издания: " + AtTheMountainsOfMadness.getPublishingYear());
        Book NineteenEightyFour = new Book("Джордж Оруэлл", "1984",1949);
        System.out.println("Автор: " + NineteenEightyFour.getAuthorName());
        System.out.println("Книга: " + NineteenEightyFour.getBookName());
        System.out.println("Год издания: " + NineteenEightyFour.getPublishingYear());
        NineteenEightyFour.setPublishingYear(1943);
        System.out.println("Придуман: gea " + NineteenEightyFour.setPublishingYear());

    }
}