class PatternMatchingSwitch {

    static void checkType(Object valueObj) {

        switch(valueObj) {

            case Integer num ->
                    System.out.println("Integer: " + num);

            case String word ->
                    System.out.println("String: " + word);

            case Double decimal ->
                    System.out.println("Double: " + decimal);

            default ->
                    System.out.println("Unknown Type");
        }
    }

    public static void main(String[] args) {

        checkType(100);

        checkType("Java");

        checkType(45.6);
    }
}

/*
Output:
Integer: 100
String: Java
Double: 45.6
*/