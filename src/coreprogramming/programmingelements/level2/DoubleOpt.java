package coreprogramming.programmingelements.level2;

import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        System.out.print("Enter three numbers: ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double one = a + b * c;
        double two = a * b + c;
        double three = c + a / b;
        double four = a % b + c;
        System.out.printf("The results of Double operations are %.2f, %.2f, %.2f, and %.2f", one, two, three, four);
    }
}
