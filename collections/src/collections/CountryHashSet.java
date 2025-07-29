package collections;
import java.util.HashSet;
import java.util.Iterator;
public class CountryHashSet {
	private HashSet<String> H1 = new HashSet<>();
	public HashSet<String> saveCountryNames(String CountryName){
		H1.add(CountryName);
		return H1;
	}
	public String getCountry(String CountryName) {
		Iterator<String> iterator = H1.iterator();
		while(iterator.hasNext()) {
			String country = iterator.next();
			if(country.equals(CountryName)) {
				return country;
			}
		}
		return null;
	}
	public static void main(String[] args) {
		CountryHashSet countryset = new CountryHashSet();
		countryset.saveCountryNames("India");
		countryset.saveCountryNames("canada");
		System.out.println("HashSet: "+countryset.H1);
		
		String country1 = countryset.getCountry("India");
		System.out.println("country found: "+country1);
	}

}
