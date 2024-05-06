package basics;

import java.util.Scanner;

public class MonthDays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Enter month number [1-12] :");
		int month = s.nextInt();

		switch (month) {
		case 2:
			System.out.print("Enter year :");
			int year = s.nextInt();
			if (year % 4 == 0)
				System.out.println(29);
			else
				System.out.println(28);
			break;
		case 4, 6, 9, 11:
			System.out.println(30);
			break;
		default:
			System.out.println(31);
		}
		
		s.close();
	}

}
