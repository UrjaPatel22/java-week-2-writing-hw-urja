package javaweek2writinghw;


/**
 *15  Write a Java program to swap two variables.
 */
import java.util.Scanner;

public class Program15PrintSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first variable value : ");
        int first = sc.nextInt();
        System.out.print("Enter the second variable value : ");
        int second = sc.nextInt();
        Program15PrintSwap t = new Program15PrintSwap();
        t.swapTheValue(first, second);
        // closing the scanner object
       // Scanner.close();
    }

        public void swapTheValue ( int a, int b){
            int c;
            System.out.println("Before the swapping, The values of first variable is : " + a + " and second variable is : " + b);
            c = a;
            a = b;
            b = c;
            System.out.println("After the swapping, The values of first variable is : " + a + " and second variable is : " + b);

        }


    }
