package coreprogramming.programmingelements.level1;

public class EarthVolume {
    public static void main(String[] args) {
        int radiusInKm = 6378;
        double radiusInMiles = radiusInKm * 1.6;
        double volumeInKm = (4.00 / 3) * Math.PI * Math.pow(radiusInKm, 3);

        double volumeInMiles = (4.00 / 3) * Math.PI * Math.pow(radiusInMiles, 3);
        System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f", volumeInKm, volumeInMiles);
    }
}
