package org.effective.java.chapter.four.item18;

import java.util.Arrays;
import java.util.HashSet;

public class InstrumentedHashSetTest {

	public static void main(String[] args) {
		InstrumentedHashSet<Object> s = new InstrumentedHashSet<>();
		s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
		System.out.println(s.getAddCount());

		InstrumentedSet<String> iSet = new InstrumentedSet<>(new HashSet<>());
		iSet.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
		System.out.println(iSet.getAddCount());
	}

}
