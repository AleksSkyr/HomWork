public class Author {
    String name;
    String surname;

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }
    public String getSurname () {
        return surname;
    }

    public void setSurname (String name) {
        this.surname = surname;
    }

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String foolAuthor() {
        return name + " " + surname;
    }

}
