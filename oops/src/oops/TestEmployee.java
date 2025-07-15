package oops;

public class TestEmployee {
	public static void main(String[] args) {
		 Employee emp= new Employee("Krishna",50000,2010,"ABC123DFE");
		 
		 System.out.println("Employee Details:");
	        System.out.println("Name: " + emp.getName());
	        System.out.println("Annual Salary: " + emp.getAnnualSalary());
	        System.out.println("Year Started: " + emp.getJoinYear());
	        System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());

	        
	        
	}
}
