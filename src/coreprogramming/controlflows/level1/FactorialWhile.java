package coreprogramming.controlflows.level1;

import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the natural number: ");
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }
        long factorial = 1;
        int i = 1;
        while (i <= n) {
            factorial *= i;
            i++;
        }
        System.out.println("The factorial is " + factorial);
    }
}
