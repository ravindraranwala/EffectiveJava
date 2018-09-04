package org.effective.java.chapter.five.item37;

public class Plant {
	enum LifeCycle {
		ANNUAL, PERENNIAL, BIENNIAL
	}

	final String name;
	final LifeCycle lifeCycle;

	public Plant(String name, LifeCycle lifeCycle) {
		super();
		this.name = name;
		this.lifeCycle = lifeCycle;
	}

	@Override
	public String toString() {
		return name;
	}

}
