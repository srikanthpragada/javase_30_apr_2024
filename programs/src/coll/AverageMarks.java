package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class AverageMarks {

	public static void main(String[] args) throws IOException {
		 
		 var p = Path.of("d:\\classroom\\java\\marks.txt");
		 
		 var avg = 
			   Files.lines(p)
			   .filter(v -> v.strip().length() > 0)
		       .mapToInt(v -> Integer.parseInt(v))
		       .average();
		 
		 System.out.println(avg.getAsDouble());
	}

}
