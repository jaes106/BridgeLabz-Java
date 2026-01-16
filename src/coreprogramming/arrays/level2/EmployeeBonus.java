package coreprogramming.arrays.level2;

import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 10;
        double[] salary = new double[count];
        double[] service = new double[count];
        double[] bonus = new double[count];
        double[] newSalary = new double[count];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < count; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            salary[i] = input.nextDouble();
            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            service[i] = input.nextDouble();

            if (salary[i] <= 0 || service[i] < 0) {
                System.out.println("Invalid input, enter again");
                i--;
            }
        }

        for (int i = 0; i < count; i++) {
            bonus[i] = service[i] > 5 ? salary[i] * 0.05 : salary[i] * 0.02;
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total new salary: " + totalNewSalary);
    }
}
