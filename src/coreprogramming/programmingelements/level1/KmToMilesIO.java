package coreprogramming.programmingelements.level1;

import java.util.Scanner;

public class KmToMilesIO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter km: ");
        double Km = input.nextDouble();
        double miles = Km * 1.6;
        System.out.printf("The total miles is %.2f mile for the given %.2f km.", miles, Km);
    }
}
