package objectorientedprogramming.inheritance;
class Person {
    void role() {
        System.out.println("Person");
    }
}

class Teacher extends Person {
    void role() {
        System.out.println("Teacher");
    }
}

class Student extends Person {
    void role() {
        System.out.println("Student");
    }
}

class Staff extends Person {
    void role() {
        System.out.println("Staff");
    }
}

public class SchoolRoles {
    public static void main(String[] args) {
        Person p1 = new Teacher();
        Person p2 = new Student();
        Person p3 = new Staff();

        p1.role();
        p2.role();
        p3.role();
    }
}

