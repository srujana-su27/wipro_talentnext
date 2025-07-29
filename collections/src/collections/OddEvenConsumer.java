package collections;
import java.util.ArrayList;
import java.util.function.Consumer;
public class OddEvenConsumer {
    public static void main(String[] args) {
 
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        Consumer<Integer> displayOddEven = number -> {
            String type = (number % 2 == 0) ? "even" : "odd";
            System.out.println(number + " " + type);
        };
        numbers.forEach(displayOddEven);
    }
}
