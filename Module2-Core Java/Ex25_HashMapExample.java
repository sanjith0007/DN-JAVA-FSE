import java.util.HashMap;
import java.util.Scanner;

class HashMapExample {

    public static void main(String[] args) {

        Scanner valueReader = new Scanner(System.in);

        HashMap studentMap = new HashMap<>();

        studentMap.put(101,"Ram");
        studentMap.put(102,"Sam");
        studentMap.put(103,"John");

        System.out.print("Enter id: ");
        int searchId = valueReader.nextInt();

        System.out.println(studentMap.get(searchId));
    }
}

/*
Input:
102

Output:
Sam
*/