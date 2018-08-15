package org.effective.java.chapter.five.item31;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StackTest {

	public static void main(String[] args) {
		Stack<Number> numberStack = new Stack<>();
		Iterable<Integer> integers = List.of(1, 2);
		numberStack.push(Integer.valueOf(1));
		numberStack.pushAll(integers);
		
		Object e = numberStack.pop();
		Collection<Object> objects = new ArrayList<>();
		numberStack.popAll(objects);
	}

}
