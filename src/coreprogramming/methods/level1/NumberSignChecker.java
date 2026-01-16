package coreprogramming.methods.level1;

import java.util.Scanner;

class NumberSignChecker {

    static int checkNumber(int number) {
        if (number > 0) return 1;
        if (number < 0) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int result = checkNumber(number);

        if (result == 1) System.out.println("Positive number");
        else if (result == -1) System.out.println("Negative number");
        else System.out.println("Zero");
    }
}
