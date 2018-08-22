package org.effective.java.chapter.five.item34;

public class WeighTable {

	public static void main(String[] args) {
		double earthWeight = 185;
		double mass = earthWeight / Planet.EARTH.surfaceGravity();
		for (Planet p : Planet.values())
			System.out.printf("Your weight on %s is %f%n", p, p.surfaceWeight(mass));
	}

}
