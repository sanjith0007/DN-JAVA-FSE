import java.util.List;

record Person(String name, int age) {}

class RecordExample {

    public static void main(String[] args) {

        Person firstPerson = new Person("Ram",20);

        Person secondPerson = new Person("Sam",17);

        System.out.println(firstPerson);

        System.out.println(secondPerson);

        List<Person> peopleData =
                List.of(firstPerson, secondPerson);

        peopleData.stream()
                .filter(person -> person.age() >= 18)
                .forEach(System.out::println);
    }
}

/*
Output:
Person[name=Ram, age=20]
Person[name=Sam, age=17]
Person[name=Ram, age=20]
*/