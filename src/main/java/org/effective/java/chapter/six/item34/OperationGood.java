package org.effective.java.chapter.six.item34;

// Enum type with constant-specific method implementations.
public enum OperationGood {
	PLUS {
		public double apply(double x, double y) {
			return x + y;
		}
	},
	MINUS {
		public double apply(double x, double y) {
			return x - y;
		}
	},
	TIMES {
		public double apply(double x, double y) {
			return x * y;
		}
	},
	DIVIDE {
		public double apply(double x, double y) {
			return x / y;
		}
	};

	public abstract double apply(double x, double y);
}
