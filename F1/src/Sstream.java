import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class Sstream {
    public static void main(String[] args) {

        List<Dude> dudes = List.of(
                new Dude("Dan", "2489 N Jemberville St"),
                new Dude("Dave", "22932 S Breakneck Blvd"),
                new Dude("Dishamber", "1784 N Koenig Way"),
                new Dude("Danielo", ""));

        System.out.println(dudes.stream().count());

        dudes.stream()
                .map((dude) -> dude.handle)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        dudes.stream()
                .map((dude) -> dude.address)
                .filter(address -> address != null && address.length() > 0)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        dudes.stream()
                .map((dude) -> dude.handle)
                .mapToInt(String::length)
                .forEach(System.out::println);

        //
        Function<Dude, String> stringFunction = (dude) -> dude.handle;
        ToIntFunction<String> length = String::length;
        IntConsumer println = System.out::println;

        dudes.stream()
                .map(stringFunction)
                .mapToInt(length)
                .forEach(println);





        System.out.println();

    }


    static class Dude {
        public final String handle;
        public final String address;

        Dude(String handle, String address) {
            this.handle = handle;
            this.address = address;
        }

        public String getHandle() {
            return handle;
        }

        public String getAddress() {
            return address;
        }
    }


}
