package org.effective.java.chapter.four.item23;

public class Rectangle extends Figure {
	final double length;
	final double width;

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	double area() {
		return length * width;
	}

}
