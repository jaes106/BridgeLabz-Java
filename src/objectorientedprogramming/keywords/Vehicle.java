package objectorientedprogramming.keywords;

class Vehicle {

    static double registrationFee = 2000;

    final String registrationNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    void display(Object obj) {
        if (obj instanceof Vehicle) {
            System.out.println(ownerName + " " + vehicleType + " " + registrationNumber + " " + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle("Ramesh", "Car", "TN01AB1234");
        Vehicle.updateRegistrationFee(2500);
        v.display(v);
    }
}
