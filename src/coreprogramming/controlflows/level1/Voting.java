package coreprogramming.controlflows.level1;

import java.util.Scanner;

public class Voting {
    public static void main() {
        System.out.print("Enter your age: ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age >= 18) {
            System.out.print("The person's age is " + age + " and can vote.");
        } else {
            System.out.print("The person's age is " + age + " and cannot vote.");
        }
    }
}
