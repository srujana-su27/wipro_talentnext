package collections;
import java.util.Vector;
public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> months = new Vector<>();
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
