package coreprogramming.programmingelements.level2;

import java.util.Scanner;

class SampleTravelComputation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name ,fromcity, viacity, tocity :");
        String name = input.next(), fromCity = input.next(), viaCity = input.next(), toCity = input.next();
        System.out.print("Enter distance From starting city To Via city: ");
        double distanceFromToVia = input.nextDouble();
        System.out.print("Enter the time taken to travel from starting city to the connecting(Via) city in minutes: ");
        int timeFromToVia = input.nextInt();
        System.out.print("Enter distance From via city To final destination city: ");
        double distanceViaToFinalCity = input.nextDouble();
        System.out.print("Enter the time taken to travel from connecting city(Via) city to final city in minutes: ");
        int timeViaToFinalCity = input.nextInt();
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;
        System.out.println("The Total Distance travelled by " + name + " from " +
                fromCity + " to " + toCity + " via " + viaCity +
                " is " + totalDistance + " km and " +
                "the Total Time taken is " + totalTime + " minutes");
    }
}
