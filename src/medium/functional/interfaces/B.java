package medium.functional.interfaces;

public class B {

    int process(int num1, int num2, A a) {
        return a.compute(num1, num2);
    }

}
