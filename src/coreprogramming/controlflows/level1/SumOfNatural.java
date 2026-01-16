package coreprogramming.controlflows.level1;

import java.util.Scanner;

public class SumOfNatural {
    public static void main() {
        System.out.print("Enter a Natural number N: ");
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        if (N >= 0) {
            System.out.printf("The sum of %d natural numbers is " + N * (N + 1) / 2, N);
        } else {
            System.out.print("The number " + N + " is not a natural number");
        }
    }
}
