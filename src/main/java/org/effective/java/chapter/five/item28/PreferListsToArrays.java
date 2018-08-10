package org.effective.java.chapter.five.item28;

public class PreferListsToArrays {

	public static void main(String[] args) {
		// Arrays are covariant, hence fails at runtime.
		Object[] objectArray = new Long[1];
		objectArray[0] = "I don't fit in";

		// Generics are invariant, hence fails at compile time.
		// List<Object> ol = new ArrayList<Long>();
		// ol.add("I don't fit in");
	}

}
