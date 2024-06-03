package io;

import java.io.BufferedReader;
import java.io.FileReader;

public class ShowLines {

	public static void main(String[] args) throws Exception {
		 var fr = new FileReader("d:\\classroom\\java\\names.txt");
		 var br = new BufferedReader(fr);
		 String line;
		 
		 while(true) {
			 line = br.readLine();
			 if(line == null) // EOF
				 break;
			 
			 System.out.println(line);
		 }

		
		 br.close();
		 fr.close();
	}

}
