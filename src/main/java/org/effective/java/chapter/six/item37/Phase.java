package org.effective.java.chapter.six.item37;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Using a nested enum map to associate data with enum pairs.
// Adding a new phase using the nested EnumMap implementation.
public enum Phase {
	SOLID, LIQUID, GAS, PLASMA;

	public enum Transition {
		MELT(SOLID, LIQUID), FREEZE(LIQUID, SOLID), BOIL(LIQUID, GAS), CONDENSE(GAS, LIQUID), SUBLIME(SOLID,
				GAS), DEPOSIT(GAS, SOLID), IONIZE(GAS, PLASMA), DEIONIZE(PLASMA, GAS);

		private final Phase from;
		private final Phase to;

		private Transition(Phase from, Phase to) {
			this.from = from;
			this.to = to;
		}

		// Initialize the phase transition map.
		private static final Map<Phase, Map<Phase, Transition>> m = Stream.of(values()).collect(Collectors.groupingBy(
				t -> t.from, () -> new EnumMap<>(Phase.class),
				Collectors.toMap(t -> t.to, Function.identity(), (x, y) -> y, () -> new EnumMap<>(Phase.class))));

		public static Transition from(Phase from, Phase to) {
			return m.get(from).get(to);
		}
	}
}
