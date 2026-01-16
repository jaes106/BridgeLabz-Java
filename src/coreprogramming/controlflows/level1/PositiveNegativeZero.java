package coreprogramming.controlflows.level1;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter and integer number: ");
        int N = input.nextInt();
        if (N > 0) {
            System.out.print("Positive");
        } else if (N < 0) {
            System.out.print("Negative");
        } else {
            System.out.print("Zero");
        }
    }
}
