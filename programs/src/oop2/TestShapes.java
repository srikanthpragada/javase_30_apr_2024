package oop2;

class Circle implements ShapeOperations  {
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override 
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
	@Override
	public double getCircum() {
		return 2 * Math.PI * this.radius;
	}
}


public class TestShapes {

	public static void main(String[] args) {
		ShapeOperations s = new Circle(10);
		System.out.println(s.getArea());

	}

}
