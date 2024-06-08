package coll;

import java.util.Arrays;
import java.util.Comparator;

class LengthCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}

}

public class LambdaDemo {
	
	public static int compareByLength(String s1, String s2) {
		return s1.length() - s2.length();
	}

	public static void main(String[] args) {

		String names[] = { "Java", "Python", "C", "JavaScript", "SQL" };

		// Arrays.sort(names);
		// Arrays.sort(names, new LengthCompare());

		// Lambda Expression
//		Arrays.sort(names,
//		 (s1, s2) -> s1.length() - s2.length());
		
		// Lambda Block
//		Arrays.sort(names, (s1, s2) -> {
//			// code
//			return s1.length() - s2.length();
//		});
		
		// Method reference
		Arrays.sort(names, LambdaDemo::compareByLength);

		for (var n : names)
			System.out.println(n);

	}

}
