package datastructures.linkedlist;

class ItemNode {
    int id, qty;
    String name;
    double price;
    ItemNode next;

    ItemNode(int id, String name, int qty, double price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }
}

public class InventoryLinkedList {
    ItemNode head;

    void addItem(int id, String n, int q, double p) {
        ItemNode node = new ItemNode(id, n, q, p);
        node.next = head;
        head = node;
    }

    double totalValue() {
        double sum = 0;
        ItemNode temp = head;
        while (temp != null) {
            sum += temp.qty * temp.price;
            temp = temp.next;
        }
        return sum;
    }

    public static void main(String[] args) {
        InventoryLinkedList i = new InventoryLinkedList();
        i.addItem(1, "Pen", 10, 5);
        i.addItem(2, "Book", 3, 100);
        System.out.println(i.totalValue());
    }
}
