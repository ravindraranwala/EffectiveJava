package org.effective.java.chapter.five.item31;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;

public class RecursiveTypeBound {

	public static void main(String[] args) {
		List<String> strings = List.of("one", "two");
		String maxElement = max(strings);
		System.out.println(maxElement);

		List<ScheduledFuture<?>> scheduledFutures = null;
		max(scheduledFutures);
	}

	// Using a recursive type bound to express mutual comparability.
	// Returns max value in a collection - uses recursive type bound.
	public static <E extends Comparable<? super E>> E max(Collection<? extends E> c) {
		if (c.isEmpty())
			throw new IllegalArgumentException("Empty Collection");

		E result = null;
		for (E e : c)
			if (result == null || e.compareTo(result) > 0)
				result = Objects.requireNonNull(e);

		return result;
	}

}
