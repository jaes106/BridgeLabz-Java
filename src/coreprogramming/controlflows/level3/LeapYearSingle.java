package coreprogramming.controlflows.level3;

import java.util.Scanner;

public class LeapYearSingle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int year = input.nextInt();
        while (year < 1000 || year > 9999) {
            System.out.print("Invalid Year, enter a valid year between 1000 and 9999: ");
            year = input.nextInt();
        }
        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
