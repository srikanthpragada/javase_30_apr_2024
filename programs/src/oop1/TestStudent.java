package oop1;

class Student {
	private String name, course;
	private int feePaid;

	public Student(String name, String course) {
		this.name = name;
		this.course = course;
	}

	public Student(String name, String course, int feePaid) {
		this(name,course);
		this.feePaid = feePaid;
	}
 
	public void print() {
		System.out.println(this.name);
		System.out.println(this.course);
		System.out.println(this.feePaid);

	}

	public String getCourse() {
		return this.course;
	}

	public int getFeePaid() {
		return this.feePaid;
	}
}

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student("Mark", "Java", 8000);
		Student s2 = new Student("Scott", "AWS", 5000);

		s1.print();
		s2.print();

		System.out.println(s1.getCourse());
	}
}
