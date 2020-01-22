package medium.functional.interfaces;

import java.util.function.Consumer;

/**
 * This is an example of a Consumer<T>
 */
public class TextPrinter {

    private Consumer<String> printer = (String text) -> System.out.println(text);

    public void print(final String text) {
        printer.accept(text);
    }

    public static void main(String[] args) {
        TextPrinter textPrinter = new TextPrinter();
        textPrinter.print("Hello World");
    }


}
