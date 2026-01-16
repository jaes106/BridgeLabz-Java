package coreprogramming.arrays.level2;
import java.util.Scanner;

class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        double[] percentage = new double[n];
        String[] grade = new String[n];
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter physics marks of student " + (i + 1) + ": ");
            physics[i] = input.nextInt();
            System.out.print("Enter chemistry marks of student " + (i + 1) + ": ");
            chemistry[i] = input.nextInt();
            System.out.print("Enter maths marks of student " + (i + 1) + ": ");
            maths[i] = input.nextInt();

            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid marks, enter again");
                i--;
            }
        }

        for (int i = 0; i < n; i++) {
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            if (percentage[i] >= 90) grade[i] = "A";
            else if (percentage[i] >= 75) grade[i] = "B";
            else if (percentage[i] >= 60) grade[i] = "C";
            else grade[i] = "D";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Physics: " + physics[i] + " Chemistry: " + chemistry[i] + " Maths: " + maths[i] +
                    " Percentage: " + percentage[i] + " Grade: " + grade[i]);
        }
    }
}
