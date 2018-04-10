package org.effective.java.chapter.one;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Demonstrates a bad practice of using try-finally
public class TryFinallyBad {

	// try-finally - No longer the best way to close resources !
	static String firstLineOfFile(final String path) throws IOException {
		final BufferedReader br = new BufferedReader(new FileReader(path));
		try {
			return br.readLine();
		} finally {
			br.close();
		}
	}

	public static void main(String[] args) throws IOException {
		System.out.println(firstLineOfFile("./src/main/resources/myfile.txt"));
	}

}
