import java.util.function.Function;

public class FunctionPackage {

    public static void main(String[] args)
    {
        System.out.println("Fizzbin ready to rock.");
        Integer j = brokenIncrementFunction.apply(34);
        Integer k = incrementFunctionThatWorks.apply(34);

        System.out.println(j);
        System.out.println(k);

        System.out.println("Fizzbin Out!");
    }



    static Function<Integer, Integer> brokenIncrementFunction = number -> number++;
    static Function<Integer, Integer> incrementFunctionThatWorks = number -> number + 1;

    static int incrementByOneMethod(Integer number) {return number++; }




}
