package objectorientedprogramming.classandobject.level1;

import java.util.Scanner;

class Item {

    private int itemCode;
    private String itemName;
    private double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public void displayItem(int quantity) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Total Cost: " + calculateTotalCost(quantity));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter item code: ");
        int code = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter item name: ");
        String name = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        Item item = new Item(code, name, price);
        item.displayItem(quantity);
    }
}
