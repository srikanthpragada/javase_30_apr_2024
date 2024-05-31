package oop2;

public class AssertDemo {

	public static boolean isEven(int n) {
		return n / 2 == 0;
	}

	public static void main(String[] args) {

		assert isEven(10) : "isEven failed for 10";
		assert isEven(11) == false : "isEven failed for 11";

	}

}
