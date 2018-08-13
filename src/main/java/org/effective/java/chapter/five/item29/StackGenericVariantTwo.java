package org.effective.java.chapter.five.item29;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackGenericVariantTwo<E> {
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	public StackGenericVariantTwo() {
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(E e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public E pop() {
		if (size == 0) {
			throw new EmptyStackException();
		}
		// push requires elements to be of type E, so cast is correct.
		@SuppressWarnings("unchecked")
		E result = (E) elements[--size];
		elements[size] = null; // Eliminate obsolete references
		return result;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	private void ensureCapacity() {
		if (elements.length == size) {
			elements = Arrays.copyOf(elements, 2 * size + 1);
		}
	}
}
