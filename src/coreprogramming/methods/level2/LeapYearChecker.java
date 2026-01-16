package coreprogramming.methods.level2;
import java.util.Scanner;

class LeapYearChecker {

    static boolean isLeapYear(int year) {
        return year >= 1582 &&
                ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();

        if (isLeapYear(year))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
}

