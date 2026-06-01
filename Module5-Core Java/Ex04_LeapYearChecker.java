import java.util.Scanner;

class LeapYearChecker {
    public static void main(String[] args) {

        Scanner inputBox = new Scanner(System.in);

        System.out.print("Enter year: ");
        int yearValue = inputBox.nextInt();

        if((yearValue % 4 == 0 && yearValue % 100 != 0) || yearValue % 400 == 0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}

/*
Input:
2024

Output:
Leap Year
*/