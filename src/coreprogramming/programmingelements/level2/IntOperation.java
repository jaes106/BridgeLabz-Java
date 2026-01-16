package coreprogramming.programmingelements.level2;

import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        System.out.print("Enter three numbers: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int one = a + b * c;
        int two = a * b + c;
        int three = c + a / b;
        int four = a % b + c;
        System.out.printf("The results of int operations are %d, %d, %d, and %d", one, two, three, four);
    }
}
