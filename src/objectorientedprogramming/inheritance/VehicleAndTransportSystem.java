package objectorientedprogramming.inheritance;

class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int speed, String fuel) {
        maxSpeed = speed;
        fuelType = fuel;
    }

    void displayInfo() {
        System.out.println(maxSpeed + " " + fuelType);
    }
}

class Car extends Vehicle {
    int seats;

    Car(int speed, String fuel, int seats) {
        super(speed, fuel);
        this.seats = seats;
    }

    void displayInfo() {
        System.out.println("Car " + maxSpeed + " " + fuelType + " Seats:" + seats);
    }
}

class Truck extends Vehicle {
    int load;

    Truck(int speed, String fuel, int load) {
        super(speed, fuel);
        this.load = load;
    }

    void displayInfo() {
        System.out.println("Truck " + maxSpeed + " " + fuelType + " Load:" + load);
    }
}

class Motorcycle extends Vehicle {
    Motorcycle(int speed, String fuel) {
        super(speed, fuel);
    }

    void displayInfo() {
        System.out.println("Motorcycle " + maxSpeed + " " + fuelType);
    }
}

public class VehicleAndTransportSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car(180, "Petrol", 5),
                new Truck(120, "Diesel", 5000),
                new Motorcycle(150, "Petrol")
        };

        for (Vehicle v : vehicles)
            v.displayInfo();
    }
}
