package org.effective.java.chapter.five.item31;

import java.util.ArrayList;
import java.util.List;

public class Swap {

	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>(List.of(1, 2));
		swap(integers, 0, 1);
		System.out.println(integers);
	}

	// Two possible declarations for the swap method
	public static <E> void swapComplex(List<E> list, int i, int j) {
		list.set(i, list.set(j, list.get(i)));
	}
	
	public static void swap(List<?> list, int i, int j) {
		// list.set(i, list.set(j, list.get(i)));
		swapHelper(list, i, j);
	}
	
	// Private helper method for wildcard capture
	private static <E> void swapHelper(List<E> list, int i, int j) {
		list.set(i, list.set(j, list.get(i)));
	}

}
