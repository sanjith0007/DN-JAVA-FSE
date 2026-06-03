import java.util.Scanner;

class InvalidAgeException extends Exception {

    InvalidAgeException(String msg) {
        super(msg);
    }
}

class CustomExceptionDemo {

    static void checkAge(int ageValue) throws InvalidAgeException {

        if(ageValue < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
    }

    public static void main(String[] args) {

        Scanner ageBox = new Scanner(System.in);

        try {

            System.out.print("Enter age: ");
            int ageValue = ageBox.nextInt();

            checkAge(ageValue);
            System.out.println("Eligible");

        } catch (InvalidAgeException errorObj) {

            System.out.println(errorObj.getMessage());
        }
    }
}