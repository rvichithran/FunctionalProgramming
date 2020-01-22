package medium.functional.interfaces;

public class Example {
    public static void main(String[] args) {
        A sum = (num1, num2) -> num1 + num2;
        A multiply = (num1, num2) -> num1 * num2;
        A divide = (num1, num2) -> num1 / num2;
        A modulus = (num1, num2) -> num1 % num2;
        B b = new B();
        System.out.println("Sum :       "+b.process(20,10, sum));
        System.out.println("Multiply :  "+b.process(20,10, multiply));
        System.out.println("Divide :    "+b.process(20,10, divide));
        System.out.println("Modulus :   "+b.process(20,10, modulus));
    }
}
