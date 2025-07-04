package java_fundamentals;
import java.util.*;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		if(p > 0) {
			System.out.println("positive");
		}
		else if(p == 0) {
			System.out.println("Zero");
		}
		else {
			System.out.println("Negative");
		}
	}

}
