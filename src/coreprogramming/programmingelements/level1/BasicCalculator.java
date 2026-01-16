package coreprogramming.programmingelements.level1;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double add = a + b;
        double sub = a - b;
        double mul = a * b;
        double div = a / b;
        System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers " + a +
                " and " + b + " is %.2f, %.2f, %.2f, and %.2f", add, sub, mul, div);
    }
}
