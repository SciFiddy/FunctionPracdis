import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionPackage {

    public static void main(String[] args)
    {
        System.out.println("Fizzbin ready to rock.");
        Integer j = brokenIncrementFunction.apply(34);
        Integer k = incrementFunctionThatWorks.apply(34);
        Integer l = incrementByOneMethod(34);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);


        int m = multiplyByTen.apply(10);

        System.out.println(m);

        Function<Integer, Integer> bunchaStuff =
                incrementFunctionThatWorks
                        .andThen(multiplyByTen
                                .andThen(multiplyByTen
                                        .andThen(incrementFunctionThatWorks)));


        System.out.println("weird sh1t (2):=  "+ bunchaStuff.apply(2));
        System.out.println("weird sh1t (4):=  "+ bunchaStuff.apply(4));
        System.out.println("weird sh1t (5):=  "+ bunchaStuff.apply(5));






        //
        // Bi-Function
        // https://www.youtube.com/watch?v=VRpHdSFWGPs


        System.out.println("incrementAndMultiply(1,2):=  "  + incrementAndMultiply(1,2));
        System.out.println("incrementAndMultiplyBiFunc(1,2):=  "  + incrementAndMultiplyBiFunc.apply(1,2));


        System.out.println("Fizzbin Out!");
    }

    //
    static int incrementByOneMethod(Integer number) {return  number + 1; }

    static Function<Integer, Integer> brokenIncrementFunction = number -> number++;

    static Function<Integer, Integer> incrementFunctionThatWorks = number -> number + 1;

    static Function<Integer, Integer> multiplyByTen = n -> n * 10;


    //
    static String incrementAndMultiply(Integer number, Integer multiple) { return Integer.toString((number + 1) * multiple); }

    static BiFunction<Integer, Integer,Integer> incrementAndMultiplyBiFunc =
            (number,multiple) -> (number+1) * multiple;

}
