import java.util.Scanner;

class StringReversal {

    public static void main(String[] args) {

        Scanner textBox = new Scanner(System.in);

        System.out.print("Enter text: ");
        String originalWord = textBox.nextLine();

        StringBuilder reverseMaker = new StringBuilder(originalWord);

        System.out.println(reverseMaker.reverse());
    }
}

/*
Input:
hello

Output:
olleh
*/