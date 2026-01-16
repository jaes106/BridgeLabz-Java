package coreprogramming.programmingelements.level2;

import java.util.Scanner;

public class Income {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the salary and bonus amount: ");
        double salary = input.nextDouble();
        double bonus = input.nextDouble();
        double total = salary + bonus;
        System.out.printf("The salary is INR %.2f and bonus is INR %.2f. Hence Total Income is INR %.2f", salary, bonus, total);
    }
}
