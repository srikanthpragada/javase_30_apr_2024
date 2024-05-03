package basics;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// scanner is taking input from keyboard
		Scanner s = new Scanner(System.in);

		System.out.print("Enter year :");
		int year = s.nextInt(); // read int from scanner

		if (year % 4 == 0)
			System.out.println("Leap Year!");
		else
			System.out.println("Not a leap year!");

		s.close();
	}
}
