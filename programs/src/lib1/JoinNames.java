package lib1;

import java.util.Scanner;
import java.util.StringJoiner;

public class JoinNames {

	public static void main(String[] args) {
		var names = new StringJoiner(":");
		var s = new Scanner(System.in);
		 
		while(true)
		{
			 System.out.print("Enter name [end to stop] :");
			 var name = s.nextLine();
			 
			 if(name.equals("end"))
				 break;
			 
			 names.add(name);
		}
		
		System.out.println(names.toString());

		s.close();
	}

}
