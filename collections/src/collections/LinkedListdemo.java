package collections;
import java.util.LinkedList;
public class LinkedListdemo {
	public static void main(String[] args) {
		LinkedList<String> months = new LinkedList<>();
		months.add("January");
		months.add("Febraury");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
		months.add("July");
		months.add("August");
		months.add("September");
		months.add("October");
		months.add("November");
		months.add("December");
		System.out.println("All the months in a year: ");
		for(String month :months) {
			System.out.println(month);
		}
	}

}
