package basics;

import java.util.Scanner;

public class AverageOfNumbers {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int total = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter a number:");
			int n = s.nextInt();

			total += n;
		}

		System.out.println(total / 5);

		s.close();
	}
}
