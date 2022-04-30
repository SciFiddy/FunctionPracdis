import java.util.function.Supplier;

public class Ssupplier
{


    public static void main(String[] args) {
        System.out.println(getSomeStaticThing());

        System.out.println(suppFunc.get());

    }

    static Supplier<String> suppFunc =
            () -> "This never changes";

    static String getSomeStaticThing(){
        return "This never changes";
    }
}
