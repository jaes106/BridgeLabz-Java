package coreprogramming.controlflows.level2;

import java.util.Scanner;

public class MultiplesBelow100For {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid no.");
            return;
        }

        for (int i = 100; i >= 1; i--) {
            if (i % number == 0)
                System.out.println(i);
        }
    }
}

