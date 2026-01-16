package coreprogramming.controlflows.level1;

import java.util.Scanner;

public class SumNaturalFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }
        int sumFor = 0;
        for (int i = 1; i <= n; i++) {
            sumFor += i;
        }
        int sumFormula = n * (n + 1) / 2;
        System.out.println("For Sum: " + sumFor);
        System.out.println("Formula Sum: " + sumFormula);
        System.out.println("Both are same as " + sumFor + " == " + sumFormula);
    }
}

