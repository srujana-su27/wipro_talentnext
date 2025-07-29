package collections;
import java.util.ArrayList;
import java.util.Iterator;
class EmployeeDB {
	private ArrayList<Employee> list ;
	public EmployeeDB() {
		list = new ArrayList<>();
	}
	public boolean addEmployee(Employee e) {
		return list.add(e);
	}
	public boolean deleteEmployee(int empId) {
		Iterator<Employee> iterator = list.iterator();
		while(iterator.hasNext()) {
			Employee employee = iterator.next();
			if(employee.getEmpId()== empId) {
				iterator.remove();
				return true;	
			}
		}
		return false;
	}
	public String showPaySlip(int empId) {
		for(Employee employee :list) {
			if(employee.getEmpId()== empId) {
				return "PaySlip for EmployeeID: "+empId+"\n"+"Employee Name: "+employee.getEmpName()+"\n"+"Salary: "+employee.getSalary();
			}
		}
		return "Employee with ID "+empId +"not found.";
	}
	public Employee findEmployee(int empId){
        for (Employee employee : list) {
           if (employee.getEmpId() == empId) {
               return employee;
           }
       }
       return null;
   }
	 public ArrayList<Employee> listAllEmployees() {
	        return new ArrayList<>(this.list); 
	    }
	}


