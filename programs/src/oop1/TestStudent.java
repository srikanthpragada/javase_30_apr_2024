package oop1;

class Student {
	private String name, course;
	private int feePaid;

	public Student(String n, String c, int f) {
		name = n;
		course = c;
		feePaid = f;
	}

	public Student(String n, String c) {
		name = n;
		course = c;
	}

	public Student(String n) {
		name = n;
		course = "Java";
	}

	public void print() {
		System.out.println(name);
		System.out.println(course);
		System.out.println(feePaid);

	}

	public String getCourse() {
		return course;
	}

	public int getFeePaid() {
		return feePaid;
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
