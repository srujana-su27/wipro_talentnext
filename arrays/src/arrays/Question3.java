package arrays;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int [n];
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		int index = -1;
		for(int i = 0;i<n;i++) {
			if(arr[i] == target) {
				index = i;
				break;
			}
		}
		System.out.println(index);
		sc.close();
	}

}
