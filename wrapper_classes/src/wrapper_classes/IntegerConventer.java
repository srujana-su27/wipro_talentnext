package wrapper_classes;
public class IntegerConventer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length == 0) {
			System.out.println("Please provide an integer as a command-line arguement.");
			return;
		}
		try {
			int number = Integer.parseInt(args[0]);
			System.out.println("Given number: "+number);
			System.out.println("Binary equivalent: "+Integer.toBinaryString(number));
			System.out.println("Octal equivalent: " +Integer.toOctalString(number));
			System.out.println("Hexadecimal equivalent :" +Integer.toHexString(number));
			
		}
		catch(NumberFormatException e) {
			System.out.println("Invalid input. Please provide a valid integer.");
		}

	}

}
