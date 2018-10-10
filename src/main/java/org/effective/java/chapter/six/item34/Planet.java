package org.effective.java.chapter.six.item34;

public enum Planet {
	MERCURY(3.303e+23, 2.4397e6), VENUS(4.869e+24, 6.0518e6), EARTH(5.976e+24, 6.37814e6), MARS(6.421e+23,
			3.3972e6), JUPITER(1.9e+27,
					7.1492e7), SATURN(5.688e+26, 6.0268e7), URANUS(8.686e+25, 2.5559e7), NEPTUNE(1.024e+26, 2.4746e7);

	private final double mass; // In kilograms
	private final double radius; // In metersF
	private final double surfaceGravity; // In m / s^2

	// Universal gravitational constant in m^3 / kg s^2
	private static final double G = 6.67300E-11;

	// Constructor.
	Planet(double mass, double radius) {
		this.mass = mass;
		this.radius = radius;
		this.surfaceGravity = G * mass / (radius * radius);
	}

	public double getMass() {
		return mass;
	}

	public double getRadius() {
		return radius;
	}

	public double surfaceGravity() {
		return surfaceGravity;
	}

	double surfaceWeight(double otherMass) {
		return otherMass * surfaceGravity();
	}
}
