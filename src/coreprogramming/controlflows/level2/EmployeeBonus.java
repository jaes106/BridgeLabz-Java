package coreprogramming.controlflows.level2;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the salary and years of service: ");
        double salary = input.nextDouble();
        int yearsOfService = input.nextInt();
        double bonus = 0;
        if (yearsOfService > 5)
            bonus = salary * 0.05;
        System.out.println(bonus);
    }
}

