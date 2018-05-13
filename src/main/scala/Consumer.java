import java.util.*;

public class Consumer {

    static List<String> aList = Arrays.asList("An", "array", "of", "strings");
    static List<Integer> aListOfIntegers = Arrays.asList(1,2,3,4,5);

    public static void main(String[] args) {
        EventHandler eventHandler = new EventHandler();
        IntegerEventHandler integerEventHandler = new IntegerEventHandler();
        aList.stream().map(String::toUpperCase).forEach(eventHandler);
        aListOfIntegers.forEach(integerEventHandler);
        aListOfIntegers.stream().map(Integer::doubleValue).forEach(integerEventHandler);
    }

    ConsumerInterface aConsumer = () -> System.out.println("Lambda");
}

interface ConsumerInterface {

    void anything();
}

class EventHandler implements java.util.function.Consumer<String> {

    public void accept(String s) {
        System.out.println("This is the String from CONSUMER: " + s);
    }
}

class IntegerEventHandler implements java.util.function.Consumer<Number> {

    public void accept(Number number) {
        System.out.println("INTEGER Consumer : " + number);
    }

}