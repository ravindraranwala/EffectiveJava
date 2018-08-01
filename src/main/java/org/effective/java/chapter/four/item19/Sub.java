package org.effective.java.chapter.four.item19;

import java.time.Instant;

public final class Sub extends Super {
	// Blank final, set by constructor
	private final Instant instant;

	public Sub() {
		super();
		this.instant = Instant.now();
	}

	// Overriding method invoked by superclass constructor.
	@Override
	public void overrideMe() {
		System.out.println(instant);
	}
	
	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.overrideMe();
	}
}
