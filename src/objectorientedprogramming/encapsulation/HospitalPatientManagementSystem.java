package objectorientedprogramming.encapsulation;
abstract class Patient {
    private int id;
    private String name;

    Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract double calculateBill();

    void getPatientDetails() {
        System.out.println(id + " " + name);
    }
}

class InPatient extends Patient {
    InPatient(int id, String name) {
        super(id, name);
    }

    double calculateBill() {
        return 5000;
    }
}

public class HospitalPatientManagementSystem {
    public static void main(String[] args) {
        Patient p = new InPatient(1, "Raj");
        p.getPatientDetails();
        System.out.println(p.calculateBill());
    }
}
