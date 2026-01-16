package objectorientedprogramming.keywords;

class Employee {

    static String companyName = "TechCorp";
    static int totalEmployees = 0;

    final int id;
    String name;
    String designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void display(Object obj) {
        if (obj instanceof Employee) {
            System.out.println(name + " " + id + " " + designation + " " + companyName);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Arun", 1, "Developer");
        Employee e2 = new Employee("Meera", 2, "Tester");

        e1.display(e1);
        e2.display(e2);
        Employee.displayTotalEmployees();
    }
}
