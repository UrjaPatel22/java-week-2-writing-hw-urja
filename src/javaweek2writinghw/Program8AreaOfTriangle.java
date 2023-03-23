package javaweek2writinghw;
/**
 *8 Write a program to calculate the area of a triangle.
 */

import java.util.Scanner;

public class Program8AreaOfTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int length = sc.nextInt();
        System.out.println("Enter the Height");
        int height = sc.nextInt();
        triangle(length,height);
        sc.close();
    }

    public static void triangle(int length,int height ){
        int area = (length * height) / 2;
        System.out.println("The Area of a triangle is : " + area);
    }
}
