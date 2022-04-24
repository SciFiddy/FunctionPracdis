import java.util.function.Predicate;

public class FunctionPackage {

    public static void main(String[] args) {
        System.out.println("Fizzbin ready to rock.");

        Predicate<String> isBlank = String::isBlank;
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<Person> isOldAF = person -> Age.NINETY_NINE.equals(person.age);

        System.out.println("Fizzbin Out!");
    }



    static class Person{
        private final String name;

        private Age age;

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
