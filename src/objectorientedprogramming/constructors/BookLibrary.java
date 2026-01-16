package objectorientedprogramming.constructors;
class BookLibrary {

    public String ISBN;
    protected String title;
    private String author;

    BookLibrary(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends BookLibrary {

    EBook(String i, String t, String a) {
        super(i, t, a);
    }

    void display() {
        System.out.println(ISBN + " " + title);
    }

    public static void main(String[] args) {
        EBook e = new EBook("123", "Java", "James");
        e.display();
    }
}
