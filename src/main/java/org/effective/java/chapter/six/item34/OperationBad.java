package org.effective.java.chapter.six.item34;

// Enum type that switches on it's own value - questionable
public enum OperationBad {
	PLUS, MINUS, TIMES, DIVIDE;

	// Do the arithmetic operation represented by this constant.
	public double apply(double x, double y) {
		switch (this) {
		case PLUS:
			return x + y;
		case MINUS:
			return x - y;
		case TIMES:
			return x * y;
		case DIVIDE:
			return x / y;
		}
		throw new AssertionError("Unknown op: " + this);
	}
}
