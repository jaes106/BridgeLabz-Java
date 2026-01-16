package coreprogramming.methods.level2;
import java.util.Scanner;

class StudentVoteChecker {

    static boolean canStudentVote(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();

            if (canStudentVote(ages[i]))
                System.out.println("Can Vote");
            else
                System.out.println("Cannot Vote");
        }
    }
}
