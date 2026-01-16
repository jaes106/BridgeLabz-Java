package coreprogramming.programmingelements.level1;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        System.out.print("Enter the base and height of the triangle in cm: ");
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double height = input.nextDouble();
        double areaInCm = 0.5 * base * height;
        double areaInInch = areaInCm / 6.4516;
        System.out.printf("The area of triangle in square cm is %.2f and in square inches is %.2f", areaInCm, areaInInch);
    }
}
