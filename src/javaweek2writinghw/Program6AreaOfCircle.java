package javaweek2writinghw;

import java.util.Scanner;

/**
 *6 Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
 */
public class Program6AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Radius:");
        double radius = sc.nextDouble();
        areaOfCircle(radius);
        sc.close();
    }

    public static void areaOfCircle(double radius){
        double pi = Math.PI;
        double area = (pi*radius*radius);
        System.out.println("The area of Circle is: " + area);
    }

}
