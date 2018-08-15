package org.effective.java.chapter.five.item31;

import java.util.HashSet;
import java.util.Set;

public class UnionTest {

	public static void main(String[] args) {
		// Simple program to exercise generic method
		Set<Integer> integers = Set.of(1, 3, 5);
		Set<Double> doubles = Set.of(2.0, 4.0, 6.0);
		Set<Number> numbers = union(integers, doubles);
		System.out.println(numbers);
	}

	// Uses raw types - unacceptable ! (Item 26)
	public static Set unionRaw(Set s1, Set s2) {
		Set result = new HashSet<>(s1);
		result.addAll(s2);
		return result;
	}

	// Generic method
	public static <E> Set<E> union(Set<? extends E> s1, Set<? extends E> s2) {
		Set<E> result = new HashSet<>(s1);
		result.addAll(s2);
		return result;
	}
}
