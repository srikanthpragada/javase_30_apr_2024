package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SortNames {

	public static void main(String[] args) throws IOException {
		 var p = Path.of("d:\\classroom\\java\\names.txt");
		 Files.lines(p)
		      .sorted()
		      .forEach(System.out::println);
	}

}
