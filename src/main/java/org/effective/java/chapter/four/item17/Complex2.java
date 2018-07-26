package org.effective.java.chapter.four.item17;

// Notice the alternative, which is effectively final.
public class Complex2 {
	private final double re;
	private final double im;

	private Complex2(double re, double im) {
		super();
		this.re = re;
		this.im = im;
	}

	public double realPart() {
		return re;
	}

	public double imaginaryPart() {
		return im;
	}

	public static Complex valueOf(double re, double im) {
		return new Complex(re, im);
	}

	// Remainder unchanged.
}
