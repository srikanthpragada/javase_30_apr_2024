package oop1;

public class TestCounter {

	public static void main(String[] args) {
	     Counter c;  // object reference 
	     
	     c = new Counter(); // Create object 
	     
	     c.inc();
	     c.inc();
	     c.dec();
	     
	     System.out.println(c.getValue());
	}

}
