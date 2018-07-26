package org.effective.java.chapter.two.item9;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Demonstrates a bad practice of using try-finally
public class TryFinallyBad {
	private static final int BUFFER_SIZE = 100;

	// try-finally - No longer the best way to close resources !
	static String firstLineOfFile(final String path) throws IOException {
		final BufferedReader br = new BufferedReader(new FileReader(path));
		try {
			return br.readLine();
		} finally {
			br.close();
		}
	}

	// try-finally is ugly when used with more than one resource!
	static void copy(String src, String dst) throws IOException {
		InputStream in = new FileInputStream(src);
		try {
			OutputStream out = new FileOutputStream(dst);
			try {
				byte[] buf = new byte[BUFFER_SIZE];
				int n;
				while ((n = in.read(buf)) >= 0) {
					out.write(buf, 0, n);
				}
			} finally {
				out.close();
			}
		} finally {
			in.close();
		}
	}

	public static void main(String[] args) throws IOException {
		System.out.println(firstLineOfFile("./src/main/resources/myfile.txt"));
	}

}
