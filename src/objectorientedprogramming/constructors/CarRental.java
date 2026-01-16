package objectorientedprogramming.constructors;

class CarRental {

    private String customerName;
    private String carModel;
    private int rentalDays;
    private double rate = 1000;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double totalCost() {
        return rentalDays * rate;
    }

    public static void main(String[] args) {
        CarRental c = new CarRental("Sam", "Sedan", 4);
        System.out.println(c.totalCost());
    }
}
