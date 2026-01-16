package coreprogramming.controlflows.level1;

import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the natural number: ");
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("The factorial is " + factorial);
    }
}


