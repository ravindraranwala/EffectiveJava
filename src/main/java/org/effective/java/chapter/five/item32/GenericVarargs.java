package org.effective.java.chapter.five.item32;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class GenericVarargs {

	public static void main(String[] args) {
		// dangerous(List.of("One"));
		// String[] attributes = pickTwo("Good", "Fast", "Cheap");
		List<String> attributes = pickTwoGood("Good", "Fast", "Cheap");
		System.out.println(attributes);
	}

	static void dangerous(List<String>... stringLists) {
		List<Integer> intList = List.of(42);
		Object[] objects = stringLists;
		objects[0] = intList; // Heap pollution
		String s = stringLists[0].get(0); // ClassCastException
	}

	static <T> T[] pickTwo(T a, T b, T c) {
		switch (ThreadLocalRandom.current().nextInt(3)) {
		case 0:
			return toArray(a, b);
		case 1:
			return toArray(a, c);
		case 2:
			return toArray(b, c);
		}

		throw new AssertionError(); // Can't get here
	}

	static <T> List<T> pickTwoGood(T a, T b, T c) {
		switch (ThreadLocalRandom.current().nextInt(3)) {
		case 0:
			return List.of(a, b);
		case 1:
			return List.of(a, c);
		case 2:
			return List.of(b, c);
		}

		throw new AssertionError(); // Can't get here
	}

	// UNSAFE - Exposes a reference to its generic parameter array!
	static <T> T[] toArray(T... args) {
		return args;
	}

	// Safe method with a generic varargs parameter
	@SafeVarargs
	static <T> List<T> flatten(List<? extends T>... lists) {
		List<T> result = new ArrayList<>();
		for (List<? extends T> list : lists)
			result.addAll(list);
		return result;
	}

	// List as a typesafe alternative to a generic varargs parameter
	static <T> List<T> flattenGood(List<List<? extends T>> lists) {
		List<T> result = new ArrayList<>();
		for (List<? extends T> list : lists)
			result.addAll(list);
		return result;
	}
}
