package objectorientedprogramming.classandobject.level2;
import java.util.Scanner;

class MovieTicket {

    private String movieName;
    private int seatNumber;
    private double price;

    public MovieTicket(String movieName) {
        this.movieName = movieName;
    }

    public void bookTicket(int seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie name: ");
        MovieTicket ticket = new MovieTicket(sc.nextLine());

        System.out.print("Enter seat number: ");
        int seat = sc.nextInt();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        ticket.bookTicket(seat, price);
        ticket.displayTicket();
    }
}
