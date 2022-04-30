import java.util.function.Predicate;

public class Ppredicate {

    public static void main(String[] args) {

        Cconsumer.Dude d3 = new Cconsumer.Dude("Dishamber", "1784 N Koenig Way");
        Cconsumer.Dude d4 = new Cconsumer.Dude("Danielo", "");

        if (isAddressValid(d3.address)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

        if (isAddressValid(d4.address)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

        if (isAddressValidPredicate.test(d3.address)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

        if (isAddressValidPredicate.test(d4.address)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

        if (containsKoenig.test(d3.address)) {
            System.out.println("Yep!  Here it is... " + d3.address);
        } else {
            System.out.println("Nope");
        }

        if (containsKoenig.test(d4.address)) {
            System.out.println("Yep!  Here it is... " + d4.address);
        } else {
            System.out.println("Nope");
        }

        if (isAddressValidPredicate.or(containsKoenig).test(d3.address)) {
            System.out.println("Yep!!  Here it is... " + d3.address);
        } else {
            System.out.println("Hmm");
        }

        if (isAddressValidPredicate.or(containsKoenig).test(d4.address)) {
            System.out.println("Yep!!  Here it is... " + d4.address);
        } else {
            System.out.println("Hmm");
        }
    }

    static Predicate<String> isAddressValidPredicate =
            address -> address != null && address.length() > 0;

    static Predicate<String> containsKoenig = address -> address.contains("Koenig");

    static boolean isAddressValid(String address) {
        return address != null && address.length() > 0;
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
