package org.effective.java.chapter.three.item10;

public class ColorPoint extends Point {
	private final Color color;

	public ColorPoint(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Point))
			return false;
		// if o is a normal point, do a color-blind comparison
		if (!(obj instanceof ColorPoint))
			return obj.equals(this);
		// o is a ColorPoint, do a full comparison
		return super.equals(obj) && ((ColorPoint) obj).color == (color);
	}

}
