package io;

import java.io.FileWriter;

public class WriteNames {

	public static void main(String[] args) throws Exception {
		String names[] = { "Larry", "Bill", "Barry", "Kevin", "Scott" };

		try (var fw = new FileWriter("d:\\classroom\\java\\authors.txt")) {
			for (var name : names) {
				fw.write(name + "\n");
			}
		}

	}

}
