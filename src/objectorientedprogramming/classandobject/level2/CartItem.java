package objectorientedprogramming.classandobject.level2;
import java.util.Scanner;

class CartItem {

    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int qty) {
        quantity += qty;
    }

    public void removeItem(int qty) {
        quantity -= qty;
        if (quantity < 0) quantity = 0;
    }

    public double getTotalCost() {
        return price * quantity;
    }

    public void displayCart() {
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + getTotalCost());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String name = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        CartItem item = new CartItem(name, price, qty);

        System.out.print("Enter quantity to add: ");
        item.addItem(sc.nextInt());
        System.out.print("Enter quantity to remove: ");
        item.removeItem(sc.nextInt());

        item.displayCart();
    }
}
