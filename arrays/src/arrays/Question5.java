package arrays;
import java.util.*;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n < 2) {
            System.out.println("Need at least 2 elements.");
            return;
        }
		int []arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		int firstSmallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		for(int num :arr) {
			if(num > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = num;
			}
			else if (num >secondLargest && num != firstLargest) {
				secondLargest = num;
			}
			if(num < firstSmallest) {
				secondSmallest = firstSmallest;
				firstSmallest = num;	
			}
			else if(num < secondSmallest && num != firstSmallest) {
				secondSmallest = num;
				
			}
			
		}
		System.out.println("First Largest " + firstLargest + " Second Largest " + secondLargest);
		System.out.println("First smallest " + firstSmallest + " Second smallest " + secondSmallest);
		sc.close();
	}

}
