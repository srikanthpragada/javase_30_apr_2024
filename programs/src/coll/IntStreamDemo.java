package coll;

import java.util.stream.Stream;

public class IntStreamDemo {

	public static void main(String[] args) {
		  var s = Stream.of(10,20,45,33,44,22, 4);
		  
		  s.filter( v -> v % 2 == 0)
		   .sorted() 
		   .skip(2)
		   .forEach(System.out::println);
		  // .forEach(v -> System.out.println(v));

	}

}
