package oop1;

public class Course {
	// instance variables
	private String title;
	private int fee, duration;
	
	// static or class variable
	private static int taxRate = 15;

	public Course(String title, int fee, int duration) {
		this.title = title;
		this.fee = fee;
		this.duration = duration;
	}

	public int netFee() {
		return this.fee + this.fee * taxRate / 100;
	}
	
	public static int getTaxRate() {
		return Course.taxRate;
	}
	
	

}
