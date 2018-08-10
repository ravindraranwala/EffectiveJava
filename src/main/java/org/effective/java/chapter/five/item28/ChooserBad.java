package org.effective.java.chapter.five.item28;

import java.util.Collection;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

// Chooser - a class badly in need of generics !
public class ChooserBad {
	private final Object[] choiceArray;

	public ChooserBad(Collection choices) {
		choiceArray = choices.toArray();
	}

	public Object choose() {
		Random rnd = ThreadLocalRandom.current();
		return choiceArray[rnd.nextInt(choiceArray.length)];
	}
}
