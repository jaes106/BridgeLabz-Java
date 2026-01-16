package objectorientedprogramming.keywords;

class Patient {

    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    final int patientID;
    String name;
    int age;
    String ailment;

    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void display(Object obj) {
        if (obj instanceof Patient) {
            System.out.println(name + " " + age + " " + ailment + " " + patientID + " " + hospitalName);
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Sita", 30, "Fever", 501);
        Patient p2 = new Patient("Rohit", 45, "Diabetes", 502);

        p1.display(p1);
        p2.display(p2);
        Patient.getTotalPatients();
    }
}
