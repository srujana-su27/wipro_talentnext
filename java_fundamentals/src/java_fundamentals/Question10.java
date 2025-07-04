package java_fundamentals;
import java.util.*;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch >= 'a' && ch <='z') {
			char res = Character.toUpperCase(ch);
			System.out.println(ch  + " -> " + res);
		}
		else if (ch >= 'A' && ch <='Z') {
			char res1 = Character.toLowerCase(ch);
			System.out.println(ch + " -> " + res1);
		}
		else {
			System.out.println("Invalid input");
		}

	}

}
