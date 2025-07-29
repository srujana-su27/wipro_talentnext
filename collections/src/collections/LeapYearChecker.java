package collections;
import java.time.Year;
public class LeapYearChecker {
	public static boolean isLeapYear() {
		int currentYear = Year.now().getValue();
		if (currentYear % 4 == 0) {
            if (currentYear % 100 == 0) {
                if (currentYear % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        if (isLeapYear()) {
            System.out.println("The current year is a leap year.");
        } else {
            System.out.println("The current year is not a leap year.");
        }
    
	}

}
