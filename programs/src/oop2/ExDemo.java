package oop2;

public class ExDemo {

	public static void main(String[] args) {
		String st = "0";

		try {
			int n = Integer.parseInt(st);
			System.out.println(100 / n);
		} catch (NumberFormatException ex) {
			System.out.println("Invalid Number!");
		} finally {
			System.out.println("Finally!");
		}

		System.out.println("The End!");

	}

}
