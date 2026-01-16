package coreprogramming.programmingelements.level1;

import java.util.Scanner;

public class HeightToFeet {
    public static void main(String[] args) {
        System.out.print("Enter your height in cm: ");
        Scanner input = new Scanner(System.in);
        double heightInCm = input.nextDouble();
        double heightInInch = heightInCm / 2.54;
        int heightInFeet = (int) heightInInch / 12;
        double remainingInch = heightInInch % 12;
        System.out.printf("Your Height in cm is " + heightInCm +
                " while in feet is %d'%.2f and inches is %.2f", heightInFeet, remainingInch, heightInInch);
    }
}
