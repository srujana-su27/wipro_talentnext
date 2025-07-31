package collections;
import java.util.*;
class Employee {
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String email;
	private String address;
	
	public Employee(String firstName, String lastName,String mobileNumber,String email,String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber= mobileNumber;
		this.email=email;
		this.address=address;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	 public String getMobileNumber() {
	        return mobileNumber;
	 }
	 public String getEmail() {
	        return email;
	 }
	 public String getAddress() {
	       return address;
	 }
}
class EmployeeRegister {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of Employees: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Employee " + (i + 1) + " Details:");
            System.out.print("Enter the Firstname: ");
            String firstName = sc.nextLine();

            System.out.print("Enter the Lastname: ");
            String lastName = sc.nextLine();

            System.out.print("Enter the Mobile: ");
            String mobile = sc.nextLine();

            System.out.print("Enter the Email: ");
            String email = sc.nextLine();

            System.out.print("Enter the Address: ");
            String address = sc.nextLine();

            employees.add(new Employee(firstName, lastName, mobile, email, address));
        }
        Collections.sort(employees, Comparator.comparing(Employee::getFirstName));
        System.out.format("%-15s %-15s %-15s %-30s %-15s%n", "FirstName", "LastName", "Mobile", "Email", "Address");
      
        for (Employee emp : employees) {
            System.out.format("%-15s %-15s %-15s %-30s %-15s%n",
                emp.getFirstName(),
                emp.getLastName(),
                emp.getMobileNumber(),
                emp.getEmail(),
                emp.getAddress());
        }

        sc.close();
    }
}
