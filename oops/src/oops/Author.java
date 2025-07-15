package oops;
import java.util.*;
public class Author {
	private String name;
	private String email;
	private char gender;
	public Author(String name,String email,char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public char getGender() {
		return gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
}
class Book{
	  private String name;
	 private double price;
	 private int qtyInStock;
	 private Author author;
	 public Book(String name,Author author,double price,int qtyInStock) {
		 this.name =name;
		 this.author = author;
		 this.price = price;
		 this.qtyInStock = qtyInStock;
	 }
	public String getName() {
		return name;
	}
	public Author getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	
}
 class Main{
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("Enter author name: ");
	        String authorName = scanner.nextLine();

	        System.out.print("Enter author email: ");
	        String authorEmail = scanner.nextLine();

	        System.out.print("Enter author gender (M/F): ");
	        char authorGender = scanner.nextLine().charAt(0);

	        
	        Author author = new Author(authorName, authorEmail, authorGender);

	        
	        System.out.print("Enter book name: ");
	        String bookName = scanner.nextLine();

	        System.out.print("Enter book price: ");
	        double bookPrice = scanner.nextDouble();

	        System.out.print("Enter quantity in stock: ");
	        int qtyInStock = scanner.nextInt();

	        
	        Book book = new Book(bookName, author, bookPrice, qtyInStock);
	        System.out.println("\n--- Book Details ---");
	        System.out.println("Book Name: " + book.getName());
	        System.out.println("Author Name: " + book.getAuthor().getName());
	        System.out.println("Author Email: " + book.getAuthor().getEmail());
	        System.out.println("Author Gender: " + book.getAuthor().getGender());
	        System.out.println("Price: " + book.getPrice());
	        System.out.println("Quantity in stock: " + book.getQtyInStock());

	        scanner.close();
	 }
	 
 }
