import java.util.Scanner;

class EvenOddChecker {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int value = reader.nextInt();

        if(value % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}

/*
Input:
8

Output:
Even
*/