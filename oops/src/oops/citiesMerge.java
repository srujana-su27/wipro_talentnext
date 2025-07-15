package oops;

import java.util.StringJoiner;

public class citiesMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner s1 = new StringJoiner("-");
		s1.add("Kurnool");
		s1.add("West_Godavari");
		//System.out.println("s1: " +s1);
		StringJoiner s2 = new StringJoiner("-");
		s2.add("Hyderabad");
		s2.add("Bengalore");
		//System.out.println();
		s1.merge(s2);
		s2.merge(s1);
		System.out.println(s1);
		
		System.out.println(s2);

	}

}
