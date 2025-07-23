package wrapper_classes;
import java.util.*;
public class BinaryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number between 1 to 255: ");
		int decimalnumber = sc.nextInt();
		if(decimalnumber < 1||decimalnumber > 255) {
			System.out.println("Invalid input .Please enter a number between 1 and 255.");
		}
		else {
			String binaryString = Integer.toBinaryString(decimalnumber);
			String paddedBinaryString = String.format("%8s",binaryString).replace(" ","0");
			System.out.println(paddedBinaryString);
		}
		sc.close();

	}

}
