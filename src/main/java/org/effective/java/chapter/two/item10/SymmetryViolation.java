package org.effective.java.chapter.two.item10;

import java.util.ArrayList;
import java.util.List;

public class SymmetryViolation {

	public static void main(String[] args) {
		CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
		String s = "polish";
		System.out.println(cis.equals(s));
		System.out.println(s.equals(cis));

		List<CaseInsensitiveString> list = new ArrayList<>();
		list.add(cis);
		System.out.println(list.contains(s));
	}

}
