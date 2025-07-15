package oops;

import java.util.Optional;
class InValidEmployeeOptionalException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InValidEmployeeOptionalException() {
        super("Invalid Employee: Name is missing");
    }
}
public class EmployeeOptional {
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeOptional employee = new EmployeeOptional();
		//employee.name = "Srujana";
		Optional<String> n = Optional.ofNullable(employee.name);
		System.out.println(n.orElseThrow(InValidEmployeeOptionalException::new));
	}

}
