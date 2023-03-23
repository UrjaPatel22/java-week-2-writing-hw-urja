package javaweek2writinghw;


import java.util.Scanner;

/**
 *5 Write a program for a calculator with addition, subtraction, multiplication and division
 * methods all with parameters and use string concatenation methods.
 * (Note Two static and Two instance methods.)
 *  */
public class Program5_Calculator {
//Static Method

    public static void addition(int a, int b){
        int result =a+b;
        System.out.println("The Addition of" +a+ "and" +b+ "is:" +result);

    }
public static int substraction(int a, int b){
        return a-b;
}
// instance method

    public void multiplication(int a, int b){
        int result = a * b;
        System.out.println("The Multiplication of" + a + "and" + b + "is:  " +result);
    }

    public int division(int a, int b){
     return a/b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter First Number");
        int a= sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        addition(a,b);
        int subResult= substraction(a,b);
        System.out.println("The subtraction of " + a + " and " + b + " is : " +subResult);

        Program5_Calculator obj = new Program5_Calculator();
        obj.multiplication(a,b);

        int divResult = obj.division(a,b);
        System.out.println("The division of " + a + " and " + b + " is : " +divResult);
        sc.close();
    }
}
