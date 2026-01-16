package coreprogramming.programmingelements.level1;

public class Pens {
    public static void main(String[] args) {
        int pens = 14;
        int numOfStudents = 3;
        int penPerStudent = pens / numOfStudents;
        int remainingPens = pens % numOfStudents;
        System.out.println("The Pen Per Student is " + penPerStudent +
                " and the remaining pen not distrubuted is " + remainingPens);
    }

}
