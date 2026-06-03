import java.util.Scanner;

class RecursiveFibonacci {

    static int fibonacci(int positionValue) {

        if(positionValue <= 1) {
            return positionValue;
        }

        return fibonacci(positionValue - 1) + fibonacci(positionValue - 2);
    }

    public static void main(String[] args) {

        Scanner inputBox = new Scanner(System.in);

        System.out.print("Enter position: ");
        int positionValue = inputBox.nextInt();

        System.out.println("Fibonacci = " + fibonacci(positionValue));
    }
}