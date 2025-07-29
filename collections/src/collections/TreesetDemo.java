package collections;

import java.util.TreeSet;
import java.util.Collections; 
import java.util.Iterator;
import java.util.ArrayList;

public class TreesetDemo {
	public static void main(String[] args) {
		TreeSet<String> treeset = new TreeSet<>();
		treeset.add("blue");
		treeset.add("black");
		treeset.add("white");
		
		ArrayList<String> arraylist = new ArrayList<>(treeset);
		Collections.reverse(arraylist);
		
		Iterator<String> iterator = treeset.iterator();
		while(iterator.hasNext()) {
			String color = iterator.next();
			System.out.println(color);
		}
		boolean exists =treeset.contains("blue");
		System.out.println("Color exists: "+ exists);
		
	}
}