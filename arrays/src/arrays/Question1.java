package arrays;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sum =0;
		for(int i =0;i<arr.length;i++) {
			sum += arr[i];
		}
		int avg = sum/n;
		System.out.println("the sum of integer array is " + sum + " and average is " + avg);
		sc.close();
	}

}
