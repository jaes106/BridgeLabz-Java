package coreprogramming.programmingelements.level1;

import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        System.out.print("Enter the number of students: ");
        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();
        int maxNumOfHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.printf("The maximum number of handshakes possible is %d", maxNumOfHandshakes);
    }
}
