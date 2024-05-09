package oop1;

public class Course {
	 // instance variables
	 private String title;
	 private int fee, duration;
	 
	 // Constructor 
	 public Course(String t, int f, int d) {
		 title = t;
		 fee = f;
		 duration = d;
	 }
	 
	 public int netFee() {
		 return fee + fee * 12 / 100;
	 }

}
