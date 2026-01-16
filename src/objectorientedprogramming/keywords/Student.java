package objectorientedprogramming.keywords;
class Student {

    static String universityName = "SRM University";
    static int totalStudents = 0;

    final int rollNumber;
    String name;
    char grade;

    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void display(Object obj) {
        if (obj instanceof Student) {
            System.out.println(name + " " + rollNumber + " " + grade + " " + universityName);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Kiran", 10, 'A');
        Student s2 = new Student("Neha", 11, 'B');

        s1.display(s1);
        s2.display(s2);
        Student.displayTotalStudents();
    }
}
