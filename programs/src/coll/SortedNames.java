package coll;

import java.util.TreeSet;

public class SortedNames {

	public static void main(String[] args) {

		var names = new TreeSet<String>();

		names.add("Larry");
		names.add("Steve");
		names.add("Andy");
		names.add("Dave");
		names.add("Steve");

		for (var name : names)
			System.out.println(name);

	}

}
