package org.effective.java.chapter.four.item23;

public class Circle extends Figure {
	final double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * (radius * radius);
	}

}
