package medium.functional.interfaces;

import java.util.function.Function;

/**
 * This is an example of a Function<T,R>
 */
public class Mapper {

    private Function<Integer, String> intToText = (Integer i) -> "Number: "+i;

    public String convert(Integer i) {
        return intToText.apply(i);
    }

    public static void main(String[] args) {
        Mapper mapper = new Mapper();
        System.out.println(mapper.convert(100));
    }

}
