package oops;
import java.util.*;
public class Concatenate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine().replace(",","");
		String str2 = sc.nextLine().replace(",","");
		if(str1.charAt(str1.length() - 1) == str2.charAt(0)) {
			str2 = str2.substring(1);
		}
		String result = str1 + str2;
		System.out.println(result.toLowerCase());
		sc.close();

	}

}
