package objectorientedprogramming.inheritance;

interface Fuel {
    void refuel();
}

class FVehicle {
    void move() {
        System.out.println("Vehicle moves");
    }
}

class PetrolCar extends FVehicle implements Fuel {
    public void refuel() {
        System.out.println("Refueling petrol");
    }
}

class ElectricCar extends FVehicle {
    void charge() {
        System.out.println("Charging battery");
    }
}

public class VehicleFuelSystem {
    public static void main(String[] args) {
        PetrolCar p = new PetrolCar();
        ElectricCar e = new ElectricCar();

        p.move();
        p.refuel();

        e.move();
        e.charge();
    }
}
