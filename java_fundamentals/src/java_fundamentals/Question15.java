package java_fundamentals;
import java.util.*;
public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isPrime = true;
		if(n <= 1) {
			isPrime = false;
		}
		else {
			for(int i =2;i<n;i++) {
				if(n % i ==0) {
					isPrime = false;
					break;
				}
			}	
		}
		if(isPrime) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not prime");
		}
		
	}

}
