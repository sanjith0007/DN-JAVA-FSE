import java.util.Scanner;

class TryCatchExample {

    public static void main(String[] args) {

        Scanner readerBox = new Scanner(System.in);

        try {

            System.out.print("Enter first number: ");
            int topValue = readerBox.nextInt();

            System.out.print("Enter second number: ");
            int bottomValue = readerBox.nextInt();

            int finalAnswer = topValue / bottomValue;

            System.out.println("Result = " + finalAnswer);

        } catch (ArithmeticException errorObj) {

            System.out.println("Cannot divide by zero");
        }
    }
}

/*
Input:
10
0

Output:
Cannot divide by zero
*/