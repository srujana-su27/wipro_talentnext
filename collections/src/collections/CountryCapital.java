package collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class CountryCapital {
	HashMap<String, String> M1 = new HashMap<>();
	public HashMap<String,String> saveCountryCapital(String CountryName, String capital){
		M1.put(CountryName,capital);
		return M1;
	}
	public String getCapital(String CountryName) {
		return M1.get(CountryName);
	}
	public String getCountry(String capitalName) {
		for(Map.Entry<String,String> entry : M1.entrySet()) {
			if(entry.getValue().equals(capitalName)) {
				return entry.getKey();
			}
		}
		return null;
	}
	public HashMap<String,String> swapKeyValue(){
		HashMap<String,String> M2 = new HashMap<>();
		for(Map.Entry<String,String> entry: M1.entrySet()) {
			M2.put(entry.getValue(),entry.getKey());
		}
		return M2;
	}
	public ArrayList<String> getCountryList(){
		return new ArrayList<>(M1.keySet());
	}
	public static void main(String[] args) {
        CountryCapital cc = new CountryCapital();
        cc.saveCountryCapital("India", "Delhi");
        cc.saveCountryCapital("Japan", "Tokyo");
        System.out.println("M1: " + cc.M1);
        System.out.println("Capital of India: " + cc.getCapital("India"));
        System.out.println("Country of Tokyo: " + cc.getCountry("Tokyo"));
        HashMap<String, String> M2 = cc.swapKeyValue();
        System.out.println("M2: " + M2);
        ArrayList<String> countryList = cc.getCountryList();
        System.out.println("Country List: " + countryList);
	}
}
