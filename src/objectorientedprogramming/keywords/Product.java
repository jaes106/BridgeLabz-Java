package objectorientedprogramming.keywords;

class Product {

    static double discount = 10.0;

    final int productID;
    String productName;
    double price;
    int quantity;

    Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void display(Object obj) {
        if (obj instanceof Product) {
            System.out.println(productName + " " + productID + " " + price + " " + discount);
        }
    }

    public static void main(String[] args) {
        Product p = new Product("Laptop", 50000, 1, 201);
        Product.updateDiscount(15);
        p.display(p);
    }
}
