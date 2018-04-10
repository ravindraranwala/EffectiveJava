package org.effective.java.chapter.one;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TryWithResourcesGood {
	private static final int BUFFER_SIZE = 100;

	// try-with-resources - the best way to close resources !
	static String firstLineOfFile(String path) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			return br.readLine();
		}
	}

	// try-with-resources on multiple resources - short and sweet
	static void copy(String src, String dst) throws IOException {
		try (InputStream in = new FileInputStream(src); OutputStream out = new FileOutputStream(dst)) {
			final byte[] buf = new byte[BUFFER_SIZE];
			int n;
			while ((n = in.read(buf)) >= 0) {
				out.write(buf);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		System.out.println(firstLineOfFile("./src/main/resources/myfile.txt"));
		// copy("./src/main/resources/myfile.txt", "./src/main/resources/myOutFile.txt");
	}

}
