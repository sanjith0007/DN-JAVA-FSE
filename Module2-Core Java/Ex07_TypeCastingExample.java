class TypeCastingExample {
    public static void main(String[] args) {

        double decimalNumber = 45.89;
        int wholeNumber = (int) decimalNumber;

        int countValue = 25;
        double convertedValue = (double) countValue;

        System.out.println("Double to Int = " + wholeNumber);
        System.out.println("Int to Double = " + convertedValue);
    }
}

/*
Output:
Double to Int = 45
Int to Double = 25.0
*/