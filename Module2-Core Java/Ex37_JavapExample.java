class JavapExample {

    void displayMessage() {

        System.out.println("Hello Java");
    }

    public static void main(String[] args) {

        new JavapExample()
                .displayMessage();
    }
}

/*
Compile:
javac JavapExample.java

Inspect:
javap -c JavapExample
*/