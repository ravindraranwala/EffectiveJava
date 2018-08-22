package org.effective.java.chapter.five.item34;

// Switch on an enum to simulate a missing method. Notice the augmentation here.
public class OperationAugment {
	public static OperationGood inverse(OperationGood op) {
		switch (op) {
		case PLUS:
			return OperationGood.MINUS;
		case MINUS:
			return OperationGood.PLUS;
		case TIMES:
			return OperationGood.DIVIDE;
		case DIVIDE:
			return OperationGood.TIMES;
		default:
			throw new AssertionError("Unknown op: " + op);
		}
	}
}
