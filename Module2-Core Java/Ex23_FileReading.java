import java.io.File;
import java.util.Scanner;

class FileReading {

    public static void main(String[] args) throws Exception {

        File fileObj = new File("output.txt");

        Scanner fileReader = new Scanner(fileObj);

        while(fileReader.hasNextLine()) {
            System.out.println(fileReader.nextLine());
        }

        fileReader.close();
    }
}

/*
Output:
Hello Java
*/