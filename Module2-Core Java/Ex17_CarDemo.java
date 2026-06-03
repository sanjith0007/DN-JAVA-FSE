class Car {

    String make;
    String model;
    int year;

    void displayDetails() {
        System.out.println(make + " " + model + " " + year);
    }
}

class CarDemo {

    public static void main(String[] args) {

        Car firstCar = new Car();
        firstCar.make = "Toyota";
        firstCar.model = "Camry";
        firstCar.year = 2022;

        Car secondCar = new Car();
        secondCar.make = "Honda";
        secondCar.model = "City";
        secondCar.year = 2023;

        firstCar.displayDetails();
        secondCar.displayDetails();
    }
}

/*
Output:
Toyota Camry 2022
Honda City 2023
*/