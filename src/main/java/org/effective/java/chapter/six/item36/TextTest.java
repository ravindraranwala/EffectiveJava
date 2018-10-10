package org.effective.java.chapter.six.item36;

import java.util.EnumSet;

import org.effective.java.chapter.six.item36.Text.Style;

public class TextTest {

	public static void main(String[] args) {
		// Bad use hard to interprit the value
		TextBad textBad = new TextBad();
		textBad.applycolor(TextBad.STYLE_BOLD | TextBad.STYLE_ITALIC);

		// good use, value can be read nicely.
		Text text = new Text();
		text.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));
	}

}
