package objectorientedprogramming.constructors;
class Employee {

    public int employeeID;
    protected String department;
    private double salary;

    Employee(int id, String dept, double salary) {
        employeeID = id;
        department = dept;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Manager extends Employee {

    Manager(int id, String dept, double salary) {
        super(id, dept, salary);
    }

    void display() {
        System.out.println(employeeID + " " + department);
    }

    public static void main(String[] args) {
        Manager m = new Manager(1, "IT", 60000);
        m.display();
    }
}
