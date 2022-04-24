import java.util.ArrayList;
import java.util.List;

public class Main {
    public enum Age {
        TWENTY_ONE,
        TWENTY_TWO,
        TWENTY_THREE,
        TWENTY_FOUR;
    }

    public static void main(String[] args) {
        System.out.println("Fizzbin.");


        List<Person> people = new ArrayList<Person>();
        people.add(new Person("Bob",Age.TWENTY_ONE));
        people.add(new Person("Abe",Age.TWENTY_FOUR));
        people.add(new Person("Joe",Age.TWENTY_TWO));
        people.add(new Person("Kat",Age.TWENTY_ONE));
        people.add(new Person("Deb",Age.TWENTY_THREE));


        System.out.println("Fizzbin Out.");


        people.stream().filter(person -> ).





    }



    static class Person{
        private final String name;

        private Age age;

        public Person(String name, Age age) {
            this.name = name;
            this.age = age;
        }
    }
}
