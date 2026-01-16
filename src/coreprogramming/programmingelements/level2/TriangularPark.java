package coreprogramming.programmingelements.level2;

import java.util.Scanner;

public class TriangularPark {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the three sides in meters: ");
        double side1 = input.nextDouble(), side2 = input.nextDouble(), side3 = input.nextDouble();
        double perimeter = side1 + side2 + side3;
        double rounds = 5000 / perimeter;
        System.out.printf("The total number of rounds the athlete will run is %.0f to complete 5 km", rounds);

    }
}
