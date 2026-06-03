import java.util.Scanner;
import java.util.Random;

class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner playerInput = new Scanner(System.in);
        Random randomBox = new Random();

        int secretValue = randomBox.nextInt(100) + 1;
        int userGuess;

        do{

            System.out.print("Enter your guess: ");
            userGuess = playerInput.nextInt();

            if(userGuess > secretValue){
                System.out.println("Too High");
            }
            else if(userGuess < secretValue){
                System.out.println("Too Low");
            }
            else{
                System.out.println("Correct");
            }
        }while(userGuess != secretValue);
    }
}