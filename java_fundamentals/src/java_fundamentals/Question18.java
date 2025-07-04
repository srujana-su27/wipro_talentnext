package java_fundamentals;
import java.util.*;
public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rows =0;
		while(true) {
			String input = sc.nextLine().trim();
			if(input.matches("\\d+")) {
				rows = Integer.parseInt(input);
				break;	
			}
			System.out.println("Please enter an integer number");
		}
			for(int i =1;i<=rows;i++) {
				for(int j =1;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}


