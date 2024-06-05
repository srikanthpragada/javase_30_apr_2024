package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SortFile {

	public static void main(String[] args) throws IOException {
		 
		var path = Path.of("d:\\classroom\\java\\names.txt");
		var lines = Files.readAllLines(path);
		
		lines.sort(null);
		
		for(var line : lines)
			System.out.println(line);
				

	}

}
