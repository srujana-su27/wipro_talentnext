package java_fundamentals;

public class Question1 {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Error: Please provide exactly 2 command-line arguments.");
			return;
		}

		String city1 = args[0];
		String city2 = args[1];

		System.out.println(city1 + " technologies " + city2);
	}
}
