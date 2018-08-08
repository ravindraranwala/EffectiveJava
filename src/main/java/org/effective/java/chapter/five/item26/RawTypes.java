package org.effective.java.chapter.five.item26;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Fails at runtime - unsafe method uses a raw type (List)!
public class RawTypes {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		unsafeAdd(strings, Integer.valueOf(42));
		String s = strings.get(0); // Has compiler-generated cast

		Collection<?> c = new ArrayList<>();
		// c.add("verbatim");
		c.add(null);

		Collection<Object> c2 = new ArrayList<>();
		c2.add("verbatim");
		
		Set<String> s1 = new HashSet<>();
		numElementsInCommonTypeSafe(s1, s1);
	}

	private static void unsafeAdd(List list, Object o) {
		list.add(o);
	}

	// private static void unsafeAdd(List<Object> list, Object o) {
	// list.add(o);
	// }

	// Use of raw type for unknown element type - don't do this
	private static int numElementsInCommon(Set s1, Set s2) {
		int result = 0;
		for (Object o1 : s1)
			if (s2.contains(o1))
				result++;
		return result;
	}

	// Use unbounded wildcard type - typesage and flexible
	private static int numElementsInCommonTypeSafe(Set<?> s1, Set<?> s2) {
		return 1;
	}

}
