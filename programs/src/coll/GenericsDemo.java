package coll;

import java.util.ArrayList;

public class GenericsDemo {

	public static void main(String[] args) {
		var names = new ArrayList();
		
		
        names.add("Abc");  // String
        names.add(10);    // Integer 
        names.add("Pqr");
        
        var coll = new ArrayList<String>();
        coll.add("First");
        //coll.add(20);
        
        
        
        
	}

}
