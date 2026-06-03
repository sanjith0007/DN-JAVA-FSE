import java.util.Scanner;

class SimpleCalculator {
    public static void main(String[] args) {

        Scanner box = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstValue = box.nextDouble();

        System.out.print("Enter second number: ");
        double secondValue = box.nextDouble();

        System.out.print("Enter operator (+,-,*,/): ");
        char choice = box.next().charAt(0);

        double finalResult = 0;

        if(choice == '+'){
            finalResult = firstValue + secondValue;
        }
        else if(choice == '-'){
            finalResult = firstValue - secondValue;
        }
        else if(choice == '*'){
            finalResult = firstValue * secondValue;
        }
        else if(choice == '/'){
            finalResult = firstValue / secondValue;
        }

        System.out.println("Result = " + finalResult);
    }
}

/*
Input:
10
5
+

Output:
Result = 15.0
*/