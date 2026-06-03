import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {

        Scanner marksBox = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int studentMarks = marksBox.nextInt();

        if(studentMarks >= 90){
            System.out.println("Grade A");
        }
        else if(studentMarks >= 80){
            System.out.println("Grade B");
        }
        else if(studentMarks >= 70){
            System.out.println("Grade C");
        }
        else if(studentMarks >= 60){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Grade F");
        }
    }
}

/*
Input:
85

Output:
Grade B
*/