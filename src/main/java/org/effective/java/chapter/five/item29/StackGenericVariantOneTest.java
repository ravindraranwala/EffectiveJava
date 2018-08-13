package org.effective.java.chapter.five.item29;

public class StackGenericVariantOneTest {

	public static void main(String[] args) {
		StackGenericVariantOne<String> stack = new StackGenericVariantOne<>();
		stack.push("One");
		stack.push("Two");
		stack.push("Four");

		while (!stack.isEmpty()) {
			System.out.println(stack.pop().toUpperCase());
		}
	}

}
