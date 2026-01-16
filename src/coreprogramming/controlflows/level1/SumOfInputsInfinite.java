package coreprogramming.controlflows.level1;

import java.util.Scanner;

public class SumOfInputsInfinite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0.0;
        while (true) {
            System.out.print("Enter a number to add: ");
            double N = input.nextInt();
            sum += N;
            if (N < 1)
                break;
        }
        System.out.println("The total value is " + sum);
    }
}
