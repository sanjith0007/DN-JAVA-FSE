import java.util.Scanner;

class PalindromeChecker {

    public static void main(String[] args) {

        Scanner textInput = new Scanner(System.in);

        System.out.print("Enter text: ");
        String userText = textInput.nextLine();

        String cleanText = userText.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversedText = new StringBuilder(cleanText).reverse().toString();

        if(cleanText.equals(reversedText)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}

/*
Input:
madam

Output:
Palindrome
*/