package collections;
import java.util.Properties;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class StateCapitalProperties {

	public static void main(String[] args) {
		Properties stateCapitals = new Properties();
		stateCapitals.setProperty("Maharashtra", "Mumbai");
        stateCapitals.setProperty("Karnataka", "Bangalore");
        stateCapitals.setProperty("Tamil Nadu", "Chennai");
        stateCapitals.setProperty("Uttar Pradesh", "Lucknow");
        stateCapitals.setProperty("West Bengal", "Kolkata");
        System.out.println("States and Capitals:");
        Set<Map.Entry<Object, Object>> entrySet = stateCapitals.entrySet();
        Iterator<Map.Entry<Object, Object>> iterator = entrySet.iterator();

        while (iterator.hasNext()) {
            Map.Entry<Object, Object> entry = iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        

	}

}
