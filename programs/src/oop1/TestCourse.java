package oop1;

public class TestCourse {

	public static void main(String[] args) {
		 Course c1 = new Course("Power BI",5000,20);
		 System.out.println(c1.netFee());
		 
		 // calling static method 
		 System.out.println(Course.getTaxRate());
	}

}
