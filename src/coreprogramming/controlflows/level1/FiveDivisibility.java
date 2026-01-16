package coreprogramming.controlflows.level1;

import java.util.Scanner;

public class FiveDivisibility {
    public static void main(String[] args) {
        System.out.print("Enter a number to check five divisibility: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number % 5 == 0) {
            System.out.printf("Is the number %d divisible by 5? Yes", number);
        } else {
            System.out.printf("Is the number %d divisible by 5? No", number);
        }
    }
}
