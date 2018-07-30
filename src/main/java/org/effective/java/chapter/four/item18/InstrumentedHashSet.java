package org.effective.java.chapter.four.item18;

import java.util.Collection;
import java.util.HashSet;

// Broken - Inappropriate use of inheritance !
public class InstrumentedHashSet<E> extends HashSet<E> {
	// The number of attempted element insertions.
	private int addCount = 0;

	public InstrumentedHashSet() {
		super();
	}

	public InstrumentedHashSet(int initialCapacity, float loadFactor) {
		super(initialCapacity, loadFactor);
	}

	public int getAddCount() {
		return addCount;
	}

	@Override
	public boolean add(E e) {
		addCount++;
		return super.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		addCount += c.size();
		return super.addAll(c);
	}

}
