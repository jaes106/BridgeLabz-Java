package coreprogramming.extras.builtinfunction.level2;

import java.util.Scanner;

class MaximumOfThree {

    static int findMaximum(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        System.out.println("Maximum value: " + findMaximum(a, b, c));
    }
}
