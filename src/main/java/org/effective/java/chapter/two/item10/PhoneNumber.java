package org.effective.java.chapter.two.item10;

// Class with a typical equals method
public final class PhoneNumber {
	private final short areaCode, prefix, lineNum;

	public PhoneNumber(short areaCode, short prefix, short lineNum) {
		super();
		this.areaCode = rangeCheck(areaCode, 999, "area code");
		this.prefix = rangeCheck(prefix, 999, "prefix");
		this.lineNum = rangeCheck(lineNum, 9999, "line num");
	}

	private static short rangeCheck(int val, int max, String arg) {
		if (val < 0 || val > max) {
			throw new IllegalArgumentException(arg + ": " + val);
		}
		return (short) val;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof PhoneNumber))
			return false;
		PhoneNumber pn = (PhoneNumber) obj;
		return pn.lineNum == lineNum && pn.prefix == prefix && pn.areaCode == areaCode;
	}

	// Typical hashCode method.
	@Override
	public int hashCode() {
		int result = Short.hashCode(areaCode);
		result = 31 * result + Short.hashCode(prefix);
		result = 31 * result + Short.hashCode(lineNum);
		return result;
	}

	// Remainder omitted.

}
