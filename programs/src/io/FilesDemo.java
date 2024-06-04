package io;

import java.nio.file.Files;
import java.nio.file.Path;

public class FilesDemo {

	public static void main(String[] args) {
		Path p = Path.of("d:\\classroom\\java\\name.txt");
		System.out.println(p.getClass());
		System.out.println(Files.exists(p));
		
	}

}
