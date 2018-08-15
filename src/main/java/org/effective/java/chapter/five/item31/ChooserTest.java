package org.effective.java.chapter.five.item31;

import java.util.List;

public class ChooserTest {

	public static void main(String[] args) {
		List<Integer> ints = List.of(1, 2);
		Chooser<Number> c = new Chooser<>(ints);
	}

}
