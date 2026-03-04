public class AgeValidationException {

    static void checkAge(int age) {

        if (age < 18) {
            throw new ArithmeticException("Age is less than 18. Not eligible to vote.");
        } 
        else {
            System.out.println("Age is valid. You are eligible to vote.");
        }
    }

    public static void main(String[] args) {

        try {
            checkAge(16); 
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        System.out.println("Program continues normally.");
    }
}