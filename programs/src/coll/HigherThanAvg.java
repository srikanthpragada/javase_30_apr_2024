package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class HigherThanAvg {

	public static void main(String[] args) throws IOException {
		 var p = Path.of("d:\\classroom\\java\\marks.txt");
		 var s = Files.lines(p);
		 
		 var avg = 			   
			   s.filter(v -> v.strip().length() > 0)
		        .mapToInt(v -> Integer.parseInt(v))
		        .average()
		        .getAsDouble();
		 
		 
		 Files.lines(p)
		   .filter(v -> v.strip().length() > 0)
		   .mapToInt(v -> Integer.parseInt(v))
		   .filter(v -> v > avg)
		   .forEach(System.out::println);
	 
	}

}
