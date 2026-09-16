package net.lecnam.ecue2.tp3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exec  {

    public static void main(String[] args) {

        Point p1 = new Point(3,7) ;
        Point p2 = new Point(5,4) ;
        System.out.println(p1.equals(p2));

        System.out.println(p1.toString());

        double distance = p1.retourneDistance(p2);
        System.out.println(distance);

    }
}
