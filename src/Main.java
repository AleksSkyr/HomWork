public class Main {

    public static void main(String[] args) {
        Book AtTheMountainsOfMadness = new Book(" Говарда Лавкрафта", "Хребет безумия.", 1936);
        AtTheMountainsOfMadness.printBook();
//        System.out.println("Автор: " + AtTheMountainsOfMadness.getAuthorName());
//        System.out.println("Книга: " + AtTheMountainsOfMadness.getBookName());
        System.out.println("Полное имя автора: " + AtTheMountainsOfMadness.setAuthorName("Говарда Филлипса Лавкрафта"));
        System.out.println("Написание: " + AtTheMountainsOfMadness.setPublishingYear(1931));
//        System.out.println("Год издания: " + AtTheMountainsOfMadness.getPublishingYear());
        Book NineteenEightyFour = new Book("Джордж Оруэлл", "1984.",1949);
        NineteenEightyFour.printBook();
//        System.out.println("Автор: " + NineteenEightyFour.getAuthorName());
//        System.out.println("Книга: " + NineteenEightyFour.getBookName());
//        System.out.println("Год издания: " + NineteenEightyFour.getPublishingYear());
        NineteenEightyFour.setPublishingYear(1943);
        System.out.println("Придуман в: " + NineteenEightyFour.setPublishingYear(1943));

    }
}