package org.effective.java.chapter.five.item34;

// The int enum pattern - severely deficient !
public class IntEnumAntiPattern {
	public static final int APPLE_FUJI = 0;
	public static final int APPLE_PIPPIN = 1;
	public static final int APPLE_GRANNY_SMITH = 2;

	public static final int ORANGE_NAVAL = 0;
	public static final int ORANGE_TEMPLE = 1;
	public static final int ORANGE_BLOOD = 2;

	public static void main(String[] args) {
		// Tasty citrus flavored applesauce!
		int i = (APPLE_FUJI - ORANGE_TEMPLE) / APPLE_PIPPIN;
		System.out.println(i);
	}

}
