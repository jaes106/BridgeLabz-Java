package coreprogramming.controlflows.level1;

import java.util.Scanner;

public class LargestOfThree {
    public static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        System.out.print("Enter the third number: ");
        int c = input.nextInt();
        if (a > b && a > c) {
            System.out.println("Is the first number the largest? Yes\n" +
                    "Is the second number the largest? No\n" +
                    "Is the third number the largest? No\n");
        } else if (b > c && b > a) {
            System.out.println("Is the first number the largest? No\n" +
                    "Is the second number the largest? Yes\n" +
                    "Is the third number the largest? No\n");
        } else {
            System.out.println("Is the first number the largest? No\n" +
                    "Is the second number the largest? No\n" +
                    "Is the third number the largest? Yes\n");
        }
    }
}
