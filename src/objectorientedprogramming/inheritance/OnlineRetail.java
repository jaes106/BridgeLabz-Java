package objectorientedprogramming.inheritance;

class Order {
    void status() {
        System.out.println("Order placed");
    }
}

class ShippedOrder extends Order {
    void status() {
        System.out.println("Order shipped");
    }
}

class DeliveredOrder extends ShippedOrder {
    void status() {
        System.out.println("Order delivered");
    }
}

public class OnlineRetail {
    public static void main(String[] args) {
        Order o = new DeliveredOrder();
        o.status();
    }
}
