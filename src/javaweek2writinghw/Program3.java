package javaweek2writinghw;

/**
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program3 {
    //3.1 Declare one instance and one static variable
    String name = "Prime";
    static String surname = "Patel";

    // 3.2 Declare one instance method
    // 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
    public void instanceMethod() {
        System.out.println(name);
        System.out.println(Program3.surname);
    }

    //3.3Declare one static method.
    // 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
    public static void staticMethod() {
        Program3 abc = new Program3();
        System.out.println(abc.name);
        System.out.println(surname);


    }

    //3.5 Declare the Main method.
    //3.6 Call both instance and static methods into the Main method and run the programm
    public static void main(String[] args) {
        Program3 obj = new Program3();
        obj.instanceMethod();
        staticMethod();
    }

}