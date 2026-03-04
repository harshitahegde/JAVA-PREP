
class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}
public class CustomException_Throw_Throws {
    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age is less than 18. Not allowed.");
        } else {
            System.out.println("Age is valid. You are allowed.");
        }
    }

    public static void main(String[] args) {

        try {
            checkAge(16);   
        } 
        catch (InvalidAgeException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }

        System.out.println("Program continues normally.");
    }
}