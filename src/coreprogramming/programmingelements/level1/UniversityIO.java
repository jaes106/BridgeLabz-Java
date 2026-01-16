package coreprogramming.programmingelements.level1;

import java.util.Scanner;

public class UniversityIO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the fee amount and discount percentage: ");
        double fee = input.nextDouble();
        double discountPercent = input.nextDouble();
        double discount = fee / discountPercent;
        double finalFee = fee - discount;
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f", discount, finalFee);
    }
}
