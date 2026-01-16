package coreprogramming.arrays.level2;
import java.util.Scanner;

class StudentGrades2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter physics marks of student " + (i + 1) + ": ");
            marks[i][0] = input.nextInt();
            System.out.print("Enter chemistry marks of student " + (i + 1) + ": ");
            marks[i][1] = input.nextInt();
            System.out.print("Enter maths marks of student " + (i + 1) + ": ");
            marks[i][2] = input.nextInt();

            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid marks, enter again");
                i--;
            }
        }

        for (int i = 0; i < n; i++) {
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percentage[i] >= 90) grade[i] = "A";
            else if (percentage[i] >= 75) grade[i] = "B";
            else if (percentage[i] >= 60) grade[i] = "C";
            else grade[i] = "D";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Physics: " + marks[i][0] + " Chemistry: " + marks[i][1] + " Maths: " + marks[i][2] +
                    " Percentage: " + percentage[i] + " Grade: " + grade[i]);
        }
    }
}
