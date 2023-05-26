public class Main {

    public static void main(String[] args) {
        Book AtTheMountainsOfMadness = new Book(" Говарда Лавкрафта", "Хребет безумия.", 1936);
        AtTheMountainsOfMadness.printBook();
        System.out.println("Полное имя автора: " + AtTheMountainsOfMadness.setAuthorName("Говарда Филлипса Лавкрафта"));
        System.out.println("Написание: " + AtTheMountainsOfMadness.setPublishingYear(1931));
        Book NineteenEightyFour = new Book("Джордж Оруэлл", "1984.",1949);
        NineteenEightyFour.printBook();
        System.out.println("Полное имя автора: " + NineteenEightyFour.setAuthorName("Джордж Оруэлл"));
        NineteenEightyFour.setPublishingYear(1943);
        System.out.println("Придуман в: " + NineteenEightyFour.setPublishingYear(1943));

    }
}