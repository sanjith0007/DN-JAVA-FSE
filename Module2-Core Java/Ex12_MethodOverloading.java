class MethodOverloading {

    int add(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    double add(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }

    int add(int firstNum, int secondNum, int thirdNum) {
        return firstNum + secondNum + thirdNum;
    }

    public static void main(String[] args) {

        MethodOverloading helperObj = new MethodOverloading();

        System.out.println(helperObj.add(10, 20));
        System.out.println(helperObj.add(12.5, 7.5));
        System.out.println(helperObj.add(5, 10, 15));
    }
}

/*
Output:
30
20.0
30
*/