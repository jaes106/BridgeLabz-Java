package coreprogramming.programmingelements.level1;

import java.util.Scanner;

public class Billing {
    public static void main(String[] args) {
        System.out.print("Enter the unit price and item quantity to be bought: ");
        Scanner input = new Scanner(System.in);
        double unitPrice = input.nextDouble();
        int quantity = input.nextInt();
        double total = unitPrice * quantity;
        System.out.printf("The total purchase price is INR %.2f if the quantity %d and unit price is INR %.2f", total, quantity, unitPrice);
    }
}
