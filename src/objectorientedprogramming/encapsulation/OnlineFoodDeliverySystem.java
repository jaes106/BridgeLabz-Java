package objectorientedprogramming.encapsulation;

abstract class FoodItem {
    private String name;
    private double price;
    private int qty;

    FoodItem(String name, double price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    double getBasePrice() {
        return price * qty;
    }

    abstract double calculateTotalPrice();
}

class VegItem extends FoodItem {
    VegItem(String n, double p, int q) {
        super(n, p, q);
    }

    double calculateTotalPrice() {
        return getBasePrice();
    }
}

class NonVegItem extends FoodItem {
    NonVegItem(String n, double p, int q) {
        super(n, p, q);
    }

    double calculateTotalPrice() {
        return getBasePrice() + 50;
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem f = new NonVegItem("Chicken", 200, 2);
        System.out.println(f.calculateTotalPrice());
    }
}
