package org.effective.java.chapter.five.item33;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

public class AnnotationAPI {

	public static void main(String[] args) {

	}

	// Use of asSubclass to safely cast to a bounded type token.
	static Annotation getAnnotation(AnnotatedElement element, String annotationTypeName) {
		Class<?> annotationType = null; // Unbounded type token
		try {
			annotationType = Class.forName(annotationTypeName);
		} catch (Exception e) {
			throw new IllegalArgumentException(e);
		}
		return element.getAnnotation(annotationType.asSubclass(Annotation.class));
	}

}
