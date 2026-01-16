package coreprogramming.arrays.level1;

import java.util.Scanner;

public class StudentAge {
    public static void main(String[] args) {
        int[] studentAge = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < studentAge.length; i++) {
            System.out.print("Enter student " + (i + 1) + " age: ");
            studentAge[i] = input.nextInt();
        }
        for (int i = 0; i < studentAge.length; i++) {
            if (studentAge[i] < 0) {
                System.out.println("The student " + (i + 1) + " has invalid age value!");
            } else if (studentAge[i] >= 18) {
                System.out.printf("The student with the age %d can vote.\n", studentAge[i]);
            } else {
                System.out.printf("The student with the age %d cannot vote.\n", studentAge[i]);
            }
        }
    }
}
