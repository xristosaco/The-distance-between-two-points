package distancebetweentwopoints;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        System.out.println("Enter the latitude of coordinate 1: ");
        double lati = io.nextDouble();
        System.out.println("Enter the longitude of coordinate 1: ");
        double longi = io.nextDouble();
        System.out.println("Enter the latitude of coordinate 2: ");
        double lati2 = io.nextDouble();
        System.out.println("Enter the longitude of coordinate 2: ");
        double longi2 = io.nextDouble();
        System.out.println("The distance between those points is: " + distanceBetweenThoPoints(lati, longi, lati2, longi2) + " km/n");
    }

    public static double distanceBetweenThoPoints(double lati, double longi, double lati2, double longi2) {
         lati=Math.toRadians(lati);
         longi=Math.toRadians(longi);
         lati2   =Math.toRadians(lati2);
         longi2 = Math.toRadians(longi2);
         double RadiousOfearth=6373.01; // kilometers
         return RadiousOfearth * Math.acos(Math.sin(lati)*Math.sin(lati2)+Math.acos(lati)*Math.acos(lati2)*Math.cos(longi-longi2));         
               
    }
}
