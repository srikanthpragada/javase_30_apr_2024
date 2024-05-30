package oop2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int total = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter number :");
		
			try {
				total += s.nextInt();
			} catch (InputMismatchException ex) {
				s.next(); // empty buffer
				System.out.println("Invalid Number!");
			}
		}

		System.out.printf("Total = %d", total);
		s.close();
	}

}
