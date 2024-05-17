package oop1;

abstract class Shape {
	protected int x, y;

	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void print() {
		System.out.println(this.x);
		System.out.println(this.y);
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}
	
	public abstract double getArea();
}

class Circle extends Shape {
	private double radius;

	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.radius);
	}

	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}

}

class Square extends Shape {
	private double side;

	public Square(int x, int y, double side) {
		super(x, y);
		this.side = side;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.side);
	}

	public double getArea() {
		return this.side * this.side;
	}
}

class Rectangle extends Shape {
	private double length, width;

	public Rectangle(int x, int y, double length, double width) {
		super(x, y);
		this.length = length;
		this.width = width;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.length); // compile-time polymorphism 
		System.out.println(this.width);
	}

	public double getArea() {
		return this.length * this.width;
	}
}

public class TestShapes {

	public static void main(String[] args) {
		Shape s = new Circle(10, 20, 15); // upcasting
		s.print(); // runtime polymorphism 
		System.out.println(s.getArea());
		
		s = new Square(10,10,20);
		s.print(); // runtime polymorphism 
		System.out.println(s.getArea());
	}

}
