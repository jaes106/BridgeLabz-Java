package objectorientedprogramming.encapsulation;

interface Insurable {
    double calculateInsurance();
}

abstract class Vehicle {
    private String vehicleNumber;
    private double rate;

    Vehicle(String number, double rate) {
        vehicleNumber = number;
        this.rate = rate;
    }

    double getRate() {
        return rate;
    }

    abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    Car(String no, double rate) {
        super(no, rate);
    }

    double calculateRentalCost(int days) {
        return days * getRate();
    }

    public double calculateInsurance() {
        return 1000;
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle v = new Car("TN01", 2000);
        System.out.println(v.calculateRentalCost(3));
        System.out.println(((Insurable)v).calculateInsurance());
    }
}
