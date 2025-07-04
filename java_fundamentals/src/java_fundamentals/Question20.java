package java_fundamentals;
import java.util.*;
public class Question20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int rev = 0;
		while(n != 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n/10;
		}
		if(temp == rev) {
			System.out.println(temp + " is a palindrome number");
		}
		else {
			System.out.println(temp + " is not a palindrome number");
		}
	}

}
