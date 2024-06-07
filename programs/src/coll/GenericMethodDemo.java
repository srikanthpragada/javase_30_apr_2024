package coll;

import java.time.LocalDate;

public class GenericMethodDemo {

	public static <T> void print(T [] a) {
		for (var v: a)
			System.out.println(v);
	}

	public static void main(String[] args) {
	   Integer [] a = {10,20,30};
       String [] names = {"Java", "Python"};
       LocalDate [] dobs = {LocalDate.of(2024,1,1), LocalDate.of(2024,1,10)};
       
       print(names);
       print(dobs);
       print(a);

	}

}
