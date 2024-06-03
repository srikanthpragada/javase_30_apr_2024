package io;

import java.io.FileReader;

public class ShowUpper {

	public static void main(String[] args) throws Exception {
		 FileReader fr = new FileReader("d:\\classroom\\java\\names.txt");
		 int ch;
		 
		 while(true) {
			 ch = fr.read();
			 if(ch == -1)  // EOF
				 break;
			 
			 if(ch >= 65 && ch <= 90)    // Uppercase 
				 System.out.print((char)ch);
		 }

		 fr.close();
	}

}
