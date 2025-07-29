package collections;

import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Set;

public class CountryCapitalTreeMap {

    private TreeMap<String, String> M1 = new TreeMap<>();

    public TreeMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    public String getCountry(String capitalName) {
        Set<String> keys = M1.keySet();
        for (String country : keys) {
            if (M1.get(country).equals(capitalName)) {
                return country;
            }
        }
        return null;
    }

    public TreeMap<String, String> swapKeyValue() {
        TreeMap<String, String> M2 = new TreeMap<>();
        Set<String> keys = M1.keySet();
        for (String country : keys) {
            M2.put(M1.get(country), country);
        }
        return M2;
    }

    public ArrayList<String> getCountryList() {
        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args) {
        CountryCapital countryCapital = new CountryCapital();

        countryCapital.saveCountryCapital("India", "Delhi");
        countryCapital.saveCountryCapital("Japan", "Tokyo");

        System.out.println("M1: " + countryCapital.M1);
        System.out.println("Capital of India: " + countryCapital.getCapital("India"));
        System.out.println("Country of Tokyo: " + countryCapital.getCountry("Tokyo"));
        System.out.println("M2: " + countryCapital.swapKeyValue());
        System.out.println("Country List: " + countryCapital.getCountryList());
    }
}
