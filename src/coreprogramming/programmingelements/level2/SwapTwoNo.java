package coreprogramming.programmingelements.level2;

import java.util.Scanner;

public class SwapTwoNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.printf("The swapped numbers are " + number1 + " and " + number2 + ".");
    }
}



