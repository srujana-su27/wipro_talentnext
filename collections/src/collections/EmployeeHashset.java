package collections;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashset {
	public static void main(String[] args) {

		HashSet<String> empName = new HashSet<>();

		empName.add("Ram");
		empName.add("Arjun");
		empName.add("Suresh");
		empName.add("Krishna");

		Iterator<String> iterator = empName.iterator();
		System.out.println("Employee Names: ");
		while (iterator.hasNext()) {
			String emp = iterator.next();
			System.out.println(emp);
		}
	}

}
