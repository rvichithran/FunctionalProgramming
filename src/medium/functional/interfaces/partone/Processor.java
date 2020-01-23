package medium.functional.interfaces.partone;

public class Processor {

    int process(int a, int b, SampleInterface si) {
        return si.compute(a, b);
    }

}
