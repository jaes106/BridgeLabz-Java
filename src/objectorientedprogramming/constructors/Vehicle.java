package objectorientedprogramming.constructors;
class Vehicle {

    String ownerName;
    String vehicleType;
    static double registrationFee = 2000;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println(ownerName + " " + vehicleType + " " + registrationFee);
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle("Tom", "Car");
        Vehicle.updateRegistrationFee(3000);
        v.displayVehicleDetails();
    }
}
