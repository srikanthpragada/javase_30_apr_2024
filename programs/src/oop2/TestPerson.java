package oop2;

import java.util.Arrays;

class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Person other) {
		// return  this.age - other.age;
		return  this.name.compareTo(other.name);
	}

}

public class TestPerson {

	public static void main(String[] args) {
		Person persons[] = { new Person("Jack", 30),
				new Person("Scott", 20), new Person("Bill", 40),
				new Person("Mark", 25) };

		Arrays.sort(persons);
		
		for (var p : persons)
			System.out.printf("%s %d\n", p.getName(), p.getAge());
		

	}

}
