import java.util.ArrayList;
import java.util.Scanner;

class ArrayListExample {

    public static void main(String[] args) {

        Scanner entryBox = new Scanner(System.in);

        ArrayList studentList = new ArrayList<>();

        System.out.print("How many names: ");
        int totalNames = entryBox.nextInt();

        entryBox.nextLine();

        for(int index = 0; index < totalNames; index++) {
            studentList.add(entryBox.nextLine());
        }

        System.out.println(studentList);
    }
}