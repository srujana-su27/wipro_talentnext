package collections;
import java.util.ArrayList;
import java.util.Iterator;
public class StringArrayList {
	private ArrayList<String> stringlist;
	
	public StringArrayList() {
		stringlist= new ArrayList<String>();
	}
	public void addString(String str) {
		stringlist.add(str);
	}
	public void printAll() {
		Iterator<String> iterator = stringlist.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	public static void main(String[] args) {
		StringArrayList mylist = new StringArrayList();
		mylist.addString("apple");
		mylist.addString("orange");
		mylist.addString("mango");
		mylist.addString("banana");
		System.out.println("Printing all elements: ");
		mylist.printAll();
	}

}
