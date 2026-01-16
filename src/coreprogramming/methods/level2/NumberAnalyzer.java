package coreprogramming.methods.level2;

import java.util.Scanner;

class NumberAnalyzer {

    static boolean isPositive(int n) {
        return n > 0;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static int compare(int a, int b) {
        if (a > b) return 1;
        if (a < b) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();

            if (isPositive(numbers[i])) {
                if (isEven(numbers[i])) System.out.println("Positive Even");
                else System.out.println("Positive Odd");
            } else {
                System.out.println("Negative or Zero");
            }
        }

        int result = compare(numbers[0], numbers[numbers.length - 1]);

        if (result == 1) System.out.println("First is greater than last");
        else if (result == -1) System.out.println("First is less than last");
        else System.out.println("First and last are equal");
    }
}
