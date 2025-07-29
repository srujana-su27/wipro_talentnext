package collections;

import java.util.ArrayList;

public class Mainemployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDB db = new EmployeeDB();
		Employee emp1 = new Employee(101, "John Doe", "john.doe@example.com", "Male", 50000);
		Employee emp2 = new Employee(102, "Jane Smith", "jane.smith@example.com", "Female", 60000);
		Employee emp3 = new Employee(103, "Peter Jones", "peter.jones@example.com", "Male", 55000);

		db.addEmployee(emp1);
		db.addEmployee(emp2);
		db.addEmployee(emp3);
		
		System.out.println("Employee Details:");
        emp1.getEmployeeDetails();
        System.out.println("\n");
        
        System.out.println(db.showPaySlip(102));
        System.out.println("\n");
        
        System.out.println("Deleting employee with ID 101: " + db.deleteEmployee(101));
        System.out.println("\n");
        
        System.out.println(db.showPaySlip(101));
        
        System.out.println("\nRemaining Employees:");
        ArrayList<Employee> allEmployees = db.listAllEmployees();
        for (Employee employee : allEmployees) {
            System.out.println(employee);
        }

	}

}
