package datastructures.linkedlist;

class BookNode {
    int id;
    String title;
    boolean available;
    BookNode prev, next;

    BookNode(int id, String title) {
        this.id = id;
        this.title = title;
        this.available = true;
    }
}

public class LibraryDoublyLinkedList {
    BookNode head;

    void addBook(int id, String title) {
        BookNode node = new BookNode(id, title);
        node.next = head;
        if (head != null)
            head.prev = node;
        head = node;
    }

    int countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        LibraryDoublyLinkedList l = new LibraryDoublyLinkedList();
        l.addBook(1, "Java");
        l.addBook(2, "DSA");
        System.out.println(l.countBooks());
    }
}

