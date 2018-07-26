package org.effective.java.chapter.three.item10;

public class ColorPointGood {
	private final Point point;
	private final Color color;

	public ColorPointGood(int x, int y, Color color) {
		super();
		this.color = color;
		this.point = new Point(x, y);
	}

	public Point asPoint() {
		return this.point;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ColorPointGood))
			return false;
		ColorPointGood cp = (ColorPointGood) obj;
		return cp.point.equals(point) && cp.color.equals(color);
	}

}
