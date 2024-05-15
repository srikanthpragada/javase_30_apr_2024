package oop1;

class Shape {
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

public class TestShapes {

	public static void main(String[] args) {
		Circle c = new Circle(10, 20, 15);
		c.print();
		System.out.println(c.getArea());
		System.out.println(c.getX());

	}

}
