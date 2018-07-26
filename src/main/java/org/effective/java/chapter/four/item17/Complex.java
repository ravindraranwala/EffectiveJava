package org.effective.java.chapter.four.item17;

// Immutable complex number class
public final class Complex {
	private final double re;
	private final double im;

	public Complex(double re, double im) {
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

	public Complex plus(Complex c) {
		return new Complex(re + c.re, im + c.im);
	}

	public Complex minus(Complex c) {
		return new Complex(re - c.re, im - c.im);
	}

	public Complex times(Complex c) {
		return new Complex(re * c.re - im * c.im, re * c.im + im * c.re);
	}

	public Complex dividedBy(Complex c) {
		double tmp = c.re * c.re + c.im * c.im;
		return new Complex((re * c.re + im * c.im) / tmp, (im * c.re - re * c.im) / tmp);
	}

	@Override
	public int hashCode() {
		return 31 * Double.hashCode(re) + Double.hashCode(im);
	}

	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof Complex))
			return false;
		Complex c = (Complex) o;

		// See page 47 to find out why we use compare instead of ==
		return Double.compare(c.re, re) == 0 && Double.compare(c.im, im) == 0;
	}

	@Override
	public String toString() {
		return "(" + re + " + " + im + "i)";
	}

}
