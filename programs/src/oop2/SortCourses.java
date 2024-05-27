package oop2;

import java.util.Arrays;
import java.util.Comparator;

class CompareCourse implements Comparator<Course> {
	@Override
	public int compare(Course c1, Course c2) {
	    return c1.getFee() - c2.getFee();
	}
}

class Course {
	private String titie;
	private int fee;

	public Course(String titie, int fee) {
		super();
		this.titie = titie;
		this.fee = fee;
	}

	public String getTitie() {
		return titie;
	}

	public int getFee() {
		return fee;
	}
}

public class SortCourses {

//	public static void main(String[] args) {
//		 Course courses[] = { new Course("Java EE", 20000), 
//				 new Course("Power BI", 15000), new Course("AWS", 7500) };
//		 
//		 // implement Comparator<> interface 
//         Arrays.sort(courses, new CompareCourse());
//         
//         for(var c : courses)
//        	 System.out.printf("%s  - %d\n", c.getTitie(), c.getFee());
//	}
	
	public static void main(String[] args) {
		Course courses[] = { new Course("Java EE", 20000), 
				 new Course("Power BI", 15000), new Course("AWS", 7500) };
		 
		// Anonymous inner class 
        Arrays.sort(courses, new Comparator<Course>() {
			@Override
			public int compare(Course c1, Course c2) {
			    return  c1.getFee() - c2.getFee();
			}
        });
        
        for(var c : courses)
       	 System.out.printf("%s  - %d\n", c.getTitie(), c.getFee());
	}

	
	public static void main3(String[] args) {
		Course courses[] = { new Course("Java EE", 20000), 
				 new Course("Power BI", 15000), new Course("AWS", 7500) };
		 
		// Lambda expression
        Arrays.sort(courses, (c1,  c2) -> c1.getFee() - c2.getFee());
        
        for(var c : courses)
       	 System.out.printf("%s  - %d\n", c.getTitie(), c.getFee());
	}
	
}
