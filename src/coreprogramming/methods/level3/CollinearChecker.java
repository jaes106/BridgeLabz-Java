package coreprogramming.methods.level3;

class CollinearChecker {

    static boolean isCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    static boolean isCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;
    }

    public static void main(String[] args) {
        System.out.println(isCollinearBySlope(2, 4, 4, 6, 6, 8));
        System.out.println(isCollinearByArea(2, 4, 4, 6, 6, 8));
    }
}
