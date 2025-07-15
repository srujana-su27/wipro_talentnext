package oops;
import java.util.*;

public class Calculator {
	
	public static int powerInt(int num1,int num2) {
		int power1 = (int) Math.pow(num1,num2);
		return power1;
	}
	public static double powerDouble(double num1,double num2) {
		double power2 = Math.pow(num1, num2);
		return power2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the int num1 value: ");
		int a = sc.nextInt();
		System.out.println("Enter the int num2 value: ");
		int b = sc.nextInt();
		
		int result = Calculator.powerInt(a,b);
		
		System.out.println("Enter the double num11 value: ");
		double c = sc.nextDouble();
		System.out.println("Enter the double num22 value: ");
		double d = sc.nextDouble();
		
		double result1 =Calculator.powerDouble(c,d);
		
		System.out.println("The power of PowerInt: "+ result);
		System.out.println("The power of PowerDouble: "+ result1);
		sc.close();
	}
}
