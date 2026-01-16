package coreprogramming.programmingelements.level1;

import java.util.Scanner;

public class SideSquare {
    public static void main(String[] args) {
        System.out.print("Enter the perimeter of the square: ");
        Scanner input = new Scanner(System.in);
        double perimeter = input.nextDouble();
        double side = perimeter / 4;
        System.out.printf("The length of the side is %.2f whose perimeter is %.2f", side, perimeter);
    }

}
