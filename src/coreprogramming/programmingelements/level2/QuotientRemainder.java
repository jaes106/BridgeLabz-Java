package coreprogramming.programmingelements.level2;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.print("The Quotient is " + a / b + " and the remainder is " + a % b);
    }
}
