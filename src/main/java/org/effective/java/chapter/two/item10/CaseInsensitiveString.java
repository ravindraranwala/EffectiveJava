package org.effective.java.chapter.two.item10;

public final class CaseInsensitiveString {
	private final String s;

	public CaseInsensitiveString(String s) {
		super();
		this.s = s;
	}

	@Override
	public boolean equals(Object obj) {
		// if (obj instanceof CaseInsensitiveString)
		// return s.equalsIgnoreCase(((CaseInsensitiveString) obj).s);
		//
		// if (obj instanceof String) // One-way interoperability !
		// return s.equalsIgnoreCase((String) obj);
		//
		// return false;

		return obj instanceof CaseInsensitiveString && ((CaseInsensitiveString) obj).s.equalsIgnoreCase(s);
	}
}
