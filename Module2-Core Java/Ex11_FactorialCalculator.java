import java.util.Scanner;

class FactorialCalculator {
    public static void main(String[] args) {

        Scanner entryBox = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int digitValue = entryBox.nextInt();

        long finalFactorial = 1;

        for(int step = 1; step <= digitValue; step++) {
            finalFactorial *= step;
        }

        System.out.println("Factorial = " + finalFactorial);
    }
}