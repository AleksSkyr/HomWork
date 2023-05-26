public class Main {

    public static void main(String[] args) {
        Book AtTheMountainsOfMadness = new Book(" Говарда Лавкрафта", "Хребет безумия.", 1936);
        AtTheMountainsOfMadness.printBook();
        System.out.println("Полное имя автора: " + AtTheMountainsOfMadness.setAuthorName("Говарда Филлипса Лавкрафта"));
        Book NineteenEightyFour = new Book("Джордж Оруэлл", "1984.",1949);
        NineteenEightyFour.printBook();
        System.out.println("Имя автора: " + NineteenEightyFour.setAuthorName("Джордж Оруэлл"));


    }
}