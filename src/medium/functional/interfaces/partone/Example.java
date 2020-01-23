package medium.functional.interfaces.partone;

public class Example {
    public static void main(String[] args) {
        SampleInterface sum = (a, b) -> a + b;
        SampleInterface multiply = (a, b) -> a * b;
        SampleInterface divide = (a, b) -> a / b;
        SampleInterface modulus = (a, b) -> a % b;
        Processor p = new Processor();
        System.out.println("Sum :       "+p.process(20,10, sum));
        System.out.println("Multiply :  "+p.process(20,10, multiply));
        System.out.println("Divide :    "+p.process(20,10, divide));
        System.out.println("Modulus :   "+p.process(20,10, modulus));
    }
}
