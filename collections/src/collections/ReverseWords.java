package collections;
import java.util.ArrayList;
import java.util.Collections;
public class ReverseWords {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Strawberry");
		fruits.add("Grapes");
		fruits.add("Kiwi");
		fruits.add("Dragon Fruit");
		
		Collections.reverse(fruits);
		fruits.forEach(word -> System.out.println(word));

	}

}
