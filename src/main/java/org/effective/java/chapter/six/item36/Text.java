package org.effective.java.chapter.six.item36;

import java.util.Set;

public class Text {
	public enum Style {
		BOLD, ITALIC, UNDERLINE, STRIKETHROUGH
	};

	public void applyStyles(Set<Style> styles) {
		System.out.println(styles);
	}
}
