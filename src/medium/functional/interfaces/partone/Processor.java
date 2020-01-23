package medium.functional.interfaces.partone;

public class Processor {

    int process(int num1, int num2, SampleInterface a) {
        return a.compute(num1, num2);
    }

}
