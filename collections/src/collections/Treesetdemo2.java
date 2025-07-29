package collections;
import java.util.TreeSet;
public class Treesetdemo2 {
	private TreeSet<String> h1 = new TreeSet<>();
	public TreeSet<String> saveCountryNames(String countryName){
		h1.add(countryName);
		return h1;
	}
	public String getCountry(String countryName) {
		for(String country :h1) {
			if(country.equals(countryName)) {
				return country;
			}
		}
		return null;
	}
	public static void main(String[] args) {
		Treesetdemo2 countryset = new Treesetdemo2();
		countryset.saveCountryNames("USA");
        countryset.saveCountryNames("India");
        countryset.saveCountryNames("UK");
        countryset.saveCountryNames("Australia");
        String country1 = countryset.getCountry("India");
        System.out.println("Country found: " + country1);

        String country2 = countryset.getCountry("France");
        System.out.println("Country found: " + country2);
	}

}
