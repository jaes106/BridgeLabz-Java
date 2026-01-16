package objectorientedprogramming.inheritance;

class Device {
    void status() {
        System.out.println("Device ON");
    }
}

class Thermostat extends Device {
    void temperature() {
        System.out.println("Temperature set");
    }
}

public class SmartHomeDevice {
    public static void main(String[] args) {
        Thermostat t = new Thermostat();
        t.status();
        t.temperature();
    }
}
