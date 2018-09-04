package org.effective.java.chapter.five.item37;

public class PhaseBadTest {

	public static void main(String[] args) {
		// System.out.println(PhaseBad.Transition.from(PhaseBad.LIQUID,
		// PhaseBad.SOLID));
		System.out.println(Phase.Transition.from(Phase.LIQUID, Phase.GAS));
	}

}
