package datastructures.linkedlist;
class TicketNode {
    int id;
    String customer;
    TicketNode next;

    TicketNode(int id, String c) {
        this.id = id;
        customer = c;
    }
}

public class TicketReservationSystem {
    TicketNode head;

    void addTicket(int id, String c) {
        TicketNode t = new TicketNode(id, c);
        if (head == null) {
            head = t;
            t.next = head;
            return;
        }
        TicketNode temp = head;
        while (temp.next != head)
            temp = temp.next;
        temp.next = t;
        t.next = head;
    }

    void displayTickets() {
        if (head == null) return;
        TicketNode temp = head;
        do {
            System.out.println(temp.id + " " + temp.customer);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        TicketReservationSystem t = new TicketReservationSystem();
        t.addTicket(1, "Raj");
        t.addTicket(2, "Amit");
        t.displayTickets();
    }
}

