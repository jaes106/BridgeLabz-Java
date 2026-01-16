package objectorientedprogramming.encapsulation;

abstract class VehicleRide {
    private String driver;
    private double rate;

    VehicleRide(String d, double r) {
        driver = d;
        rate = r;
    }

    double getRate() {
        return rate;
    }

    abstract double calculateFare(double km);
}

class CarRide extends VehicleRide {
    CarRide(String d, double r) {
        super(d, r);
    }

    double calculateFare(double km) {
        return km * getRate();
    }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        VehicleRide v = new CarRide("Driver1", 15);
        System.out.println(v.calculateFare(10));
    }
}
