package java_fundamentals;
import java.util.*;
public class Question9 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int age =sc.nextInt();
		if(s.equalsIgnoreCase("Female")&& age > 0) {
			if(age >= 1 && age <=58) {
				System.out.println("the percentage interest is 8.2%");
			}
			else if(age >=59 && age<= 100) {
				System.out.println("the percentage interest is 9.2%");
			}
		}
		else if(s.equalsIgnoreCase("Male") && age > 0) {
			if(age >= 1 && age <=58) {
				System.out.println("the percentage interest is 8.4%");
			}
			else if(age >=59 && age<= 100) {
				System.out.println("the percentage interest is 10.5%");
			}
		}
		
	}
}
