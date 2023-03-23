package javaweek2writinghw;

import java.util.Scanner;

/**
 * 9 Write a program to convert the upper case to lower case.
 */
public class Program9ConvertUpperToLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Uppercase String");
        String uppercase = sc.nextLine();
        Program9ConvertUpperToLower obj = new Program9ConvertUpperToLower();
        obj.method(uppercase);
    }

    public void method(String uppercase){
        System.out.println("The LowerCase String:" +uppercase.toLowerCase());
    }
}
