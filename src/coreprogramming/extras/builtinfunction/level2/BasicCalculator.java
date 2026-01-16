package coreprogramming.extras.builtinfunction.level2;

import java.util.Scanner;

class BasicCalculator {

    static double add(double a, double b) { return a + b; }
    static double subtract(double a, double b) { return a - b; }
    static double multiply(double a, double b) { return a * b; }
    static double divide(double a, double b) { return a / b; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Choose operation (+ - * /): ");
        char op = sc.next().charAt(0);

        if (op == '+') System.out.println(add(a, b));
        else if (op == '-') System.out.println(subtract(a, b));
        else if (op == '*') System.out.println(multiply(a, b));
        else if (op == '/') System.out.println(divide(a, b));
    }
}
