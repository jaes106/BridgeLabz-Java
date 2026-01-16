package coreprogramming.controlflows.level2;

import java.util.Scanner;

public class FactorsWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number <= 0) return;
        int counter = 1;
        while (counter < number) {
            if (number % counter == 0)
                System.out.println(counter);
            counter++;
        }
    }
}

