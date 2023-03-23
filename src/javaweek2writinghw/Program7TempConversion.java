package javaweek2writinghw;

import java.util.Scanner;

public class Program7TempConversion {

    /**
     * 7 Write a program to insert any temperature value in degree Fahrenheit
     * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temprature");
        float temp = sc.nextFloat();
        Program7TempConversion obj = new Program7TempConversion();
        obj.instance(temp);
    }

    public void instance(float temp){
        float c = ((temp - 32) * 5 / 9);
        System.out.println(("The temperature " + temp + " fahrenheit is equal to " + c + " degree celsius"));

    }
}
