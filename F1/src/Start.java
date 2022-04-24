import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Start {


    public static void main(String[] args) {
        System.out.println("Fizzbin ready to rock.");


        List<Person> people = new ArrayList<Person>();
        people.add(new Person("Bob",Age.TWENTY_ONE));
        people.add(new Person("Abe",Age.TWENTY_FOUR));
        people.add(new Person("Joe",Age.TWENTY_TWO));
        people.add(new Person("JoeY",Age.TWENTY_TWO));
        people.add(new Person("Joseph",Age.TWENTY_TWO));
        people.add(new Person("Joe2",Age.TWENTY_TWO));
        people.add(new Person("Kat",Age.TWENTY_ONE));
        people.add(new Person("Deb",Age.TWENTY_THREE));
        people.add(new Person("Caleb",Age.NINETY_NINE));



        System.out.println(people.stream().filter(person -> Age.TWENTY_ONE.equals(person.age)).count());


        List<Person> ctrl_alt_v_is_cool = people.stream()
                .filter(person -> Age.TWENTY_TWO.equals(person.age))
                .collect(Collectors.toList());

        ctrl_alt_v_is_cool.forEach(System.out::println);

        people.stream()
                .filter(person -> Age.TWENTY_FOUR.equals(person.age))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        Predicate<Person> isOldAF = person -> Age.NINETY_NINE.equals(person.age);

        people.stream()
                .filter(isOldAF)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("Fizzbin Out!");
    }



    static class Person{
        private final String name;

        public Age age;


        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public Person(String name, Age age) {
            this.name = name;
            this.age = age;
        }
    }



    enum Age {
        TWENTY_ONE,
        TWENTY_TWO,
        TWENTY_THREE,
        TWENTY_FOUR,
        NINETY_NINE;
    }
}
