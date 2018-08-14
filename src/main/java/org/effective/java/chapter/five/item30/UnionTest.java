package org.effective.java.chapter.five.item30;

import java.util.HashSet;
import java.util.Set;

public class UnionTest {

	public static void main(String[] args) {
		// Simple program to exercise generic method
		Set<String> guys = Set.of("Tom", "Dick", "Harry");
		Set<String> stooges = Set.of("Larry", "Moe", "Curly");
		Set<String> aflCio = union(guys, stooges);
		System.out.println(aflCio);
	}

	// Uses raw types - unacceptable ! (Item 26)
	public static Set unionRaw(Set s1, Set s2) {
		Set result = new HashSet<>(s1);
		result.addAll(s2);
		return result;
	}

	// Generic method
	public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
		Set<E> result = new HashSet<>(s1);
		result.addAll(s2);
		return result;
	}
}
