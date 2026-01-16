package coreprogramming.programmingelements.level2;

import java.util.Scanner;

public class PoundsToKilos {
    public static void main(String[] args) {
        System.out.print("Enter weight in pounds: ");
        Scanner input = new Scanner(System.in);
        double pounds = input.nextDouble();
        double kilos = pounds / 2.2;
        System.out.printf("The weight of the person in pound is %.2f and in kg is %.2f", pounds, kilos);
    }
}
