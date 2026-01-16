package coreprogramming.controlflows.level1;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the salary and years of service: ");
        double salary = input.nextDouble();
        int yearsOfService = input.nextInt();
        if (yearsOfService > 5) {
            double bonus = salary * 0.05;
            System.out.println(bonus);
        } else {
            System.out.println(0);
        }
    }
}
