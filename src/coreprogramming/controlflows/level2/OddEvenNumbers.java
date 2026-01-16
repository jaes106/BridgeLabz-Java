package coreprogramming.controlflows.level2;

import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number <= 0) return;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0)
                System.out.println(i + " is Even");
            else
                System.out.println(i + " is Odd");
        }
    }
}

