package java_fundamentals;
import java.util.*;
public class Question4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int q = sc.nextInt();
		if (s > 0 & q >10) {
			if(s%10 == q% 10) {
				System.out.print("True");
			}
			else {
				System.out.println("False");
			}
		}
		
	}

}
