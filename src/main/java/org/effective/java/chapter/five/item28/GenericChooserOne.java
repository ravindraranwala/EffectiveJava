package org.effective.java.chapter.five.item28;

import java.util.Collection;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

// A first cut at making Chooser generic - won't compile
public class GenericChooserOne<T> {
	private final T[] choiceArray;

	
	public GenericChooserOne(Collection<T> choices) {
		// Notice the warning here.
		choiceArray = (T[]) choices.toArray();
	}

	// choose method unchanged.
	public T choose() {
		Random rnd = ThreadLocalRandom.current();
		return choiceArray[rnd.nextInt(choiceArray.length)];
	}
}
