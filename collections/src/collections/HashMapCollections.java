package collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class HashMapCollections {
	public static void main(String[] args) {
		Map<String,String> myHashMap = new HashMap<>();
		myHashMap.put("key1", "value1");
        myHashMap.put("key2", "value2");
        myHashMap.put("key3", "value3");
        String keyToCheck = "key2";
        if (myHashMap.containsKey(keyToCheck)) {
            System.out.println("Key '" + keyToCheck + "' exists in the HashMap.");
        } else {
            System.out.println("Key '" + keyToCheck + "' does not exist in the HashMap.");
        }
        String valueToCheck = "value2";
        if (myHashMap.containsValue(valueToCheck)) {
            System.out.println("Value '" + valueToCheck + "' exists in the HashMap.");
        } else {
            System.out.println("Value '" + valueToCheck + "' does not exist in the HashMap.");
        }
        System.out.println("Iterating through the HashMap:");
        Iterator<Map.Entry<String, String>> iterator = myHashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
	}
}
