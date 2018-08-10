package org.effective.java.chapter.five.item28;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

// List based Chooser - typesafe
public class GenericChooserTwo<T> {
	private final List<T> choiceList;

	public GenericChooserTwo(Collection<T> choices) {
		choiceList = new ArrayList<>(choices);
	}

	public T choose() {
		Random rnd = ThreadLocalRandom.current();
		return choiceList.get(rnd.nextInt(choiceList.size()));
	}
}
