package org.effective.java.chapter.five.item30;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class RecursiveTypeBound {

	public static void main(String[] args) {
		List<String> strings = List.of("one", "two");
		String maxElement = max(strings);
		System.out.println(maxElement);

	}

	// Using a recursive type bound to express mutual comparability.
	// Returns max value in a collection - uses recursive type bound.
	public static <E extends Comparable<E>> E max(Collection<E> c) {
		if (c.isEmpty())
			throw new IllegalArgumentException("Empty Collection");

		E result = null;
		for (E e : c)
			if (result == null || e.compareTo(result) > 0)
				result = Objects.requireNonNull(e);

		return result;
	}

}
