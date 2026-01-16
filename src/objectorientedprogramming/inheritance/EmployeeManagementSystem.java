package objectorientedprogramming.inheritance;
class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println(name + " " + id + " " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    void displayDetails() {
        System.out.println(name + " " + id + " " + salary + " Team:" + teamSize);
    }
}

class Developer extends Employee {
    String language;

    Developer(String name, int id, double salary, String language) {
        super(name, id, salary);
        this.language = language;
    }

    void displayDetails() {
        System.out.println(name + " " + id + " " + salary + " Lang:" + language);
    }
}

class Intern extends Employee {
    int months;

    Intern(String name, int id, double salary, int months) {
        super(name, id, salary);
        this.months = months;
    }

    void displayDetails() {
        System.out.println(name + " " + id + " " + salary + " Months:" + months);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new Manager("Alice", 1, 80000, 5);
        Employee e2 = new Developer("Bob", 2, 60000, "Java");
        Employee e3 = new Intern("Chris", 3, 15000, 6);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
