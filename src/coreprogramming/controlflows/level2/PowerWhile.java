package coreprogramming.controlflows.level2;

import java.util.Scanner;

public class PowerWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number and its power: ");
        int number = input.nextInt();
        int power = input.nextInt();
        if (number <= 0 || power < 0) {
            System.out.println("Invalid input!");
            return;
        }
        int result = 1;
        int counter = 0;
        while (counter < power) {
            result *= number;
            counter++;
        }
        System.out.println(result);
    }
}
