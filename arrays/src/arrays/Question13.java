package arrays;

public class Question13 {

	    public static void main(String[] args) {
	        // Check if 4 command-line arguments are provided
	        if (args.length != 4) {
	            System.out.println("Error: Please provide exactly 4 integers as command-line arguments.");
	            return;
	        }

	        // Parse the 4 integers
	        int[] input = new int[4];
	        try {
	            for (int i = 0; i < 4; i++) {
	                input[i] = Integer.parseInt(args[i]);
	            }
	        } catch (NumberFormatException e) {
	            System.out.println("Error: All arguments must be integers.");
	            return;
	        }

	        // Create 2x2 array
	        int[][] array = new int[2][2];
	        int index = 0;
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                array[i][j] = input[index++];
	            }
	        }

	        // Print original array
	        System.out.println("Original 2x2 array:");
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                System.out.print(array[i][j] + " ");
	            }
	            System.out.println();
	        }

	        // Print reversed array
	        System.out.println("Reversed 2x2 array:");
	        for (int i = 3; i >= 0; i--) {
	            System.out.print(input[i] + " ");

	        }
	    }
}
