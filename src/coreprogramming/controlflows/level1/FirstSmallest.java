package coreprogramming.controlflows.level1;

import java.util.Scanner;

public class FirstSmallest {
    public static void main(String[] args) {
        System.out.print("Enter three numbers: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
        if (a > b && a > c) {
            System.out.println("Is the first number the smallest? Yes");
        } else
            System.out.println("Is the first number the smallest? No");

    }
}
