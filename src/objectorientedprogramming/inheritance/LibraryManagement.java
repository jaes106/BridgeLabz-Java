package objectorientedprogramming.inheritance;
class Book {
    String title;
    int year;

    Book(String title, int year) {
        this.title = title;
        this.year = year;
    }
}

class Author extends Book {
    String name;

    Author(String title, int year, String name) {
        super(title, year);
        this.name = name;
    }

    void display() {
        System.out.println(title + " " + year + " " + name);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Author a = new Author("Java", 2022, "James");
        a.display();
    }
}
