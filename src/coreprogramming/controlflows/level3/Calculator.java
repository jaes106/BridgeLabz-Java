package coreprogramming.controlflows.level3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double first = input.nextDouble();
        double second = input.nextDouble();
        System.out.print("Enter an operation  +, -, * or /: ");
        String op = input.next();
        switch (op) {
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "*":
                System.out.println(first * second);
                break;
            case "/":
                System.out.println(first / second);
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
