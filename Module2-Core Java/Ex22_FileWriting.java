import java.io.FileWriter;
import java.util.Scanner;

class FileWriting {

    public static void main(String[] args) throws Exception {

        Scanner textReader = new Scanner(System.in);

        System.out.print("Enter text: ");
        String userContent = textReader.nextLine();

        FileWriter writerObj = new FileWriter("output.txt");

        writerObj.write(userContent);

        writerObj.close();

        System.out.println("Data written successfully");
    }
}

/*
Input:
Hello Java

Output:
Data written successfully
*/