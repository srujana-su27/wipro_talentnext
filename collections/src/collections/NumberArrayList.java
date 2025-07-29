package collections;
import java.util.ArrayList;
public class NumberArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Number> numberlist = new ArrayList<>();
		numberlist.add(20);
		numberlist.add(3.14);
		numberlist.add(2.71f);
		
		
		for(Number num: numberlist) {
			System.out.println(num);
		}

	}

}
