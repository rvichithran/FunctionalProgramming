package medium.functional.interfaces.parttwo;

import java.util.function.Predicate;

/**
 * This is an example of a Predicate<T>
 */
public class PositiveNumberTester {

    private Predicate<Integer> isPositive = (Integer i) -> i > 0;

    boolean checkIfPositive(Integer i) {
        return isPositive.test(i);
    }

    public static void main(String[] args) {
        PositiveNumberTester tester = new PositiveNumberTester();
        System.out.println(100+" is positive? "+tester.checkIfPositive(100));
        System.out.println(-1100+" is positive? "+tester.checkIfPositive(-1100));
    }
}
