import java.util.Scanner;

class ArraySumAndAverage {

    public static void main(String[] args) {

        Scanner valueBox = new Scanner(System.in);

        System.out.print("Enter size: ");
        int totalItems = valueBox.nextInt();

        int[] marksData = new int[totalItems];

        int collectedSum = 0;

        for(int pointer = 0; pointer < totalItems; pointer++) {
            marksData[pointer] = valueBox.nextInt();
            collectedSum += marksData[pointer];
        }

        double averageValue = (double) collectedSum / totalItems;

        System.out.println("Sum = " + collectedSum);
        System.out.println("Average = " + averageValue);
    }
}