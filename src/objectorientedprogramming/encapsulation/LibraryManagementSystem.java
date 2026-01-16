package objectorientedprogramming.encapsulation;
interface Reservable {
    void reserveItem();
}

abstract class LibraryItem {
    private int itemId;
    private String title;

    LibraryItem(int id, String title) {
        itemId = id;
        this.title = title;
    }

    abstract int getLoanDuration();

    void getItemDetails() {
        System.out.println(itemId + " " + title);
    }
}

class Book extends LibraryItem {
    Book(int id, String title) {
        super(id, title);
    }

    int getLoanDuration() {
        return 14;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem item = new Book(1, "Java");
        item.getItemDetails();
        System.out.println(item.getLoanDuration());
    }
}
