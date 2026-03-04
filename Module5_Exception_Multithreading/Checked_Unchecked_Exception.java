import java.io.*;

public class Checked_Unchecked_Exception {

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;  
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception Caught: " + e);
        }

        try {
            FileReader file = new FileReader("abc.txt"); 
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception Caught: " + e);
        }

        System.out.println("Program continues after handling exceptions.");
    }
}