package arrays;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []asciiValues = new int [n];
		for(int i =0;i<n;i++) {
			asciiValues[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			char ch = (char)asciiValues[i];
			System.out.print(ch + " ");
		}
		sc.close();
	}


}
