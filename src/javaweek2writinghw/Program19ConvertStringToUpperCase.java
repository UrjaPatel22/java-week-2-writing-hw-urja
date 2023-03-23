package javaweek2writinghw;

import java.util.Scanner;

/**
 *19  Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */
public class Program19ConvertStringToUpperCase {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lowercase sentence: ");
        String uppercase = scanner.nextLine();
        Program19ConvertStringToUpperCase t = new Program19ConvertStringToUpperCase();
        t.convertStringToLowerCase(uppercase);
        //Closing the scanner object
        scanner.close();

    }

    // Convert string the to lower case
    public void convertStringToLowerCase(String str) {
        System.out.println("The Lowercase of the string is = " + str.toUpperCase());
    }

}
