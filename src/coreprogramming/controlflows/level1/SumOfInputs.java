package coreprogramming.controlflows.level1;

import java.util.Scanner;

public class SumOfInputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0.0;
        System.out.print("Enter a number to add: ");
        double N = input.nextInt();
        while (N != 0) {
            sum += N;
            System.out.print("Enter a number to add: ");
            N = input.nextInt();
        }
        System.out.println("The total value is " + sum);
    }
}
