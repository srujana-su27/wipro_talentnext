package collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BasicOperations {
	public static void main(String[] args) {
		List<String> stringlist = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int choice;
		while(true) {
			System.out.println("1. Insert ");
			System.out.println("2. Search");
			System.out.println("3. Delete");
			System.out.println("4. Display");
			System.out.println("5. Exit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
				case 1: 
					System.out.println("Enter the item to be inserted: ");
					String insertItem = sc.nextLine();
					stringlist.add(insertItem);
					System.out.println("Inserted successfully");
					break;
				case 2:
					System.out.println("Enter the item to search: ");
					String item = sc.nextLine();
					if(stringlist.contains(item)) {
						System.out.println("Item found in the list.");
					}
					else {
						System.out.println("Item no found in the list.");
					}
					break;
				case 3: 
					System.out.println("Enter the item to delete: ");
					String deleteItem = sc.nextLine();
					if(stringlist.contains(deleteItem)) {
						stringlist.remove(deleteItem);
						System.out.println("Deleted successfully.");
					}
					else {
						System.out.println("Item does not exist.");
					}
					break;
				case 4:
					System.out.println("The Items in the list are: ");
					for(String items :stringlist) {
						System.out.println(items);
					}
					System.out.println();
					break;
				case 5: 
					System.out.println("Exiting.....");
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("Invalid choice, Please enter a valid number.");
				
			}
			
		}
		
		
	}
}
