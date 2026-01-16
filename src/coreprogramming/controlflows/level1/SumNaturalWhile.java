package coreprogramming.controlflows.level1;

import java.util.Scanner;

public class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }
        int sumWhile = 0;
        int i = 1;
        while (i <= n) {
            sumWhile += i;
            i++;
        }
        int sumFormula = n * (n + 1) / 2;
        System.out.println("While Sum: " + sumWhile);
        System.out.println("Formula Sum: " + sumFormula);
        System.out.println("Both are same as " + sumWhile + " == " + sumFormula);
    }
}

