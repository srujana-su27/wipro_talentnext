package collections;

public class Employee {

	int empId;
	String empName;
	String email;
	String gender;
	float salary;
	public Employee(int empId,String empName,String email,String gender,float salary) {
		this.empId = empId;
		this.empName = empName;
		this.email= email;
		this.gender= gender;
		this.salary= salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpID(int empId) {
		this.empId=empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName= empName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email= email;
	}
	public String getGender() {
		return gender;
	}
	public void getGender(String gender) {
		this.gender= gender;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary= salary;
	}
	public void getEmployeeDetails() {
		System.out.println("Employee id : "+ empId);
		System.out.println("Employee name : "+ empName);
		System.out.println("Employee email: "+email);
		System.out.println("Employee gender: "+ gender);
		System.out.println("Employee salary: "+ salary);
	}

}
