package org.effective.java.chapter.six.item37;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.effective.java.chapter.six.item37.Plant.LifeCycle;

public class PlantTest {

	public static void main(String[] args) {
		// Using ordinal() to index into an array - DON'T DO THIS!
		Set<Plant>[] plantsByLifeCycle = (Set<Plant>[]) new Set[Plant.LifeCycle.values().length];
		for (int i = 0; i < plantsByLifeCycle.length; i++)
			plantsByLifeCycle[i] = new HashSet<>();

		List<Plant> garden = Arrays.asList(new Plant("tomatoes", LifeCycle.ANNUAL),
				new Plant("carrots", LifeCycle.BIENNIAL), new Plant("pears", LifeCycle.PERENNIAL));
		for (Plant p : garden)
			plantsByLifeCycle[p.lifeCycle.ordinal()].add(p);

		// Print the results
		// for (int i = 0; i < plantsByLifeCycle.length; i++)
		// System.out.printf("%s: %s%n", Plant.LifeCycle.values()[i],
		// plantsByLifeCycle[i]);

		// Using an EnumMap to associate data with an enum.
		Map<LifeCycle, Set<Plant>> plantsByLifeCycle2 = new EnumMap<>(LifeCycle.class);
		for (LifeCycle lc : LifeCycle.values())
			plantsByLifeCycle2.put(lc, new HashSet<>());
		for (Plant p : garden)
			plantsByLifeCycle2.get(p.lifeCycle).add(p);
		// System.out.println(plantsByLifeCycle2);

		// naive stream-based approach - unlikely to produce an EnumMap!
		// System.out.println(garden.stream().collect(Collectors.groupingBy(p ->
		// p.lifeCycle)));

		// Using a stream and an EnumMap to associate data with an enum
		System.out.println(garden.stream().collect(
				Collectors.groupingBy(p -> p.lifeCycle, () -> new EnumMap<>(LifeCycle.class), Collectors.toSet())));
	}

}
