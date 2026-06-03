class OperatorPrecedence {
    public static void main(String[] args) {

        int answerOne = 10 + 5 * 2;
        int answerTwo = (10 + 5) * 2;
        int answerThree = 20 / 2 + 3 * 4;

        System.out.println(answerOne);
        System.out.println(answerTwo);
        System.out.println(answerThree);
    }
}

/*
Output:
20
30
22
*/