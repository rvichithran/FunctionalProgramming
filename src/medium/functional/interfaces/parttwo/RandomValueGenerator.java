package medium.functional.interfaces.parttwo;

import java.util.Random;
import java.util.function.Supplier;

/**
 * This is an example of a Supplier<T>
 */
public class RandomValueGenerator {

    private Supplier<Integer> generator = () -> new Random().nextInt(10);

    public int getRandom() {
        return generator.get();
    }

    public static void main(String[] args) {
        RandomValueGenerator generator = new RandomValueGenerator();
        for(int i = 0; i < 10; i++) {
            System.out.println(generator.getRandom());
        }
    }

}
