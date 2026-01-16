package coreprogramming.arrays.level1;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] N = new int[5];
        for (int i = 0; i < N.length; i++) {
            System.out.print("Enter a number: ");
            N[i] = input.nextInt();
        }
        for (int i = 0; i < N.length; i++) {
            if (N[i] > 0) {
                if (N[i] % 2 == 0) {
                    System.out.println(N[i] + " is a Even positive number.");
                } else {
                    System.out.println(N[i] + " is a Odd positive number.");
                }
            } else if (N[i] < 0) {
                if (N[i] % 2 == 0) {
                    System.out.println(N[i] + " is a Even Negative number.");
                } else {
                    System.out.println(N[i] + " is a Odd Negative number.");
                }
            } else {
                System.out.println("The no. is Zero");
            }
        }
        if (N[0] > N[4]) {
            System.out.println("The first element of the array is greater than the last element of the array.");
        } else if (N[0] < N[4]) {
            System.out.println("The first element of the array is less than the last element of the array.");
        } else {
            System.out.println("The first and the last element of the array are equal.");
        }
    }
}

