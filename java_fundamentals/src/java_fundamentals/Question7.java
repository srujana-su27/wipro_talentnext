package java_fundamentals;
import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char c1 = sc.next().charAt(0);
		char c2 = sc.next().charAt(0);
		if(c1 > c2) {
			System.out.println(c2 + ","+c1);
		}
		else {
			System.out.println(c1 + "," +c2);
		}
	}

}
