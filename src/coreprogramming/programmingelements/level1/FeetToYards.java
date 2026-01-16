package coreprogramming.programmingelements.level1;

import java.util.Scanner;

public class FeetToYards {
    public static void main(String[] args) {
        System.out.print("Enter the distance in feet : ");
        Scanner input = new Scanner(System.in);
        double feet = input.nextDouble();
        double yards = feet / 3;
        double miles = yards / 1760;
        System.out.printf("The distance " + feet + " in feet is equal to %.2f yards or %.3f miles.", yards, miles);
    }
}
