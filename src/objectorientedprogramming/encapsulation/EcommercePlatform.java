package objectorientedprogramming.encapsulation;
interface Taxable {
    double calculateTax();
}

abstract class Product {
    private int productId;
    private String name;
    private double price;

    Product(int id, String name, double price) {
        productId = id;
        this.name = name;
        this.price = price;
    }

    double getPrice() {
        return price;
    }

    abstract double calculateDiscount();
}

class Electronics extends Product implements Taxable {
    Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() {
        return getPrice() * 0.1;
    }

    public double calculateTax() {
        return getPrice() * 0.18;
    }
}

class Clothing extends Product {
    Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() {
        return getPrice() * 0.2;
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {
        Product p = new Electronics(101, "Laptop", 50000);

        double finalPrice =
                p.getPrice()
                        - p.calculateDiscount()
                        + ((Taxable)p).calculateTax();

        System.out.println(finalPrice);
    }
}
