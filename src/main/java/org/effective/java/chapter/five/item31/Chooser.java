package org.effective.java.chapter.five.item31;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

// List based Chooser - typesafe
public class Chooser<T> {
	private final List<T> choiceList;

	// Wildcard type for parameter that serves as an T producer
	public Chooser(Collection<? extends T> choices) {
		choiceList = new ArrayList<>(choices);
	}

	public T choose() {
		Random rnd = ThreadLocalRandom.current();
		return choiceList.get(rnd.nextInt(choiceList.size()));
	}
}
