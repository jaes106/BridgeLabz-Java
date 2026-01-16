package coreprogramming.controlflows.level2;

import java.util.Scanner;

public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number <= 0 || number >= 100) {
            System.out.println("Invalid no.");
            return;
        }
        int counter = 100;
        while (counter >= 1) {
            if (counter % number == 0)
                System.out.println(counter);
            counter--;
        }
    }
}

