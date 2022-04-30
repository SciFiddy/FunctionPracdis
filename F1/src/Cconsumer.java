import org.w3c.dom.ls.LSOutput;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Cconsumer {

    public static void main(String[] args) {
        Dude d1 = new Dude("Dan","2489 N Jemberville St");
        Dude d2 = new Dude("Dave","22932 S Breakneck Blvd");
        Dude d3 = new Dude("Dishamber","1784 N Koenig Way");
        Dude d4 = new Dude("Danielo","");

        supDude(d1);
        supDudeFuncV2.accept(d1 , true);
        supDude(d2);
        supDudeFuncV2.accept(d2 , false);
        supDude(d3);
        supDudeFuncV2.accept(d3 , true);
        supDude(d4);
        supDudeFuncV2.accept(d4 , false);

    }

    static BiConsumer<Dude, Boolean> supDudeFuncV2 =
            (dude, flag) -> System.out.println("Hello " + dude.handle + ", Address : " + (flag ? dude.address : "******"));

    static Consumer<Dude> supDudeFunc = dude -> System.out.println("Hello " + dude.handle + ", Address : " + dude.address);

    static void supDude(Dude dude) {
        System.out.println("Live long and Prosper " + dude.getHandle());
    }

    static class Dude {
        public final String handle;
        public final String address;

        Dude(String handle, String address) {            this.handle = handle;
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
