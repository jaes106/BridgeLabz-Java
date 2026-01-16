package objectorientedprogramming.constructors;
class HotelBooking {

    private String guestName;
    private String roomType;
    private int nights;

    HotelBooking() {
        this("NA", "Standard", 1);
    }

    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking h) {
        this(h.guestName, h.roomType, h.nights);
    }

    void display() {
        System.out.println(guestName + " " + roomType + " " + nights);
    }

    public static void main(String[] args) {
        HotelBooking b1 = new HotelBooking("Alex", "Deluxe", 3);
        HotelBooking b2 = new HotelBooking(b1);

        b1.display();
        b2.display();
    }
}
