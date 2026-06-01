class Animal {

    void makeSound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

class InheritanceExample {

    public static void main(String[] args) {

        Animal firstObj = new Animal();
        Dog secondObj = new Dog();

        firstObj.makeSound();
        secondObj.makeSound();
    }
}

/*
Output:
Animal Sound
Bark
*/