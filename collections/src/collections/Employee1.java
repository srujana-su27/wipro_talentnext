package collections;
import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;

public class Employee1 {
	String name;
	int id;
	public Employee1(String name,int id) {
		this.name= name;
		this.id=id;
	}
	public String toString() {
        return "Employee Name: " + name + ", ID: " + id;
    }

}
class EmployeeVector{
	public static void main(String[] args) {
		Vector<Employee1> employees = new Vector<>();
		employees.add(new Employee1("Madhava", 10));
        employees.add(new Employee1("Krishna", 11));
        employees.add(new Employee1("Sai", 12));
        
        System.out.println("Using Iterator:");
        Iterator<Employee1> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("\nUsing Enumeration:");
        Enumeration<Employee1> enumeration = employees.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
	}
}
