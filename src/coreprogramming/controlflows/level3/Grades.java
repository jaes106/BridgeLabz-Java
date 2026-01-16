package coreprogramming.controlflows.level3;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the marks for physics, chemistry, and maths: ");
        int physics = input.nextInt();
        int chemistry = input.nextInt();
        int maths = input.nextInt();
        int total = physics + chemistry + maths;
        double percentage = total / 3.0;
        char grade;
        if (percentage >= 80)
            grade = 'A';
        else if (percentage >= 70)
            grade = 'B';
        else if (percentage >= 60)
            grade = 'C';
        else if (percentage >= 50)
            grade = 'D';
        else if (percentage >= 40)
            grade = 'E';
        else
            grade = 'R';
        System.out.printf("average Percentage is %.2f\n", percentage);
        System.out.println("Grade: " + grade);
    }
}

