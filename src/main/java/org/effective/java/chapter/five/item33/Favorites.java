package org.effective.java.chapter.five.item33;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// Typesafe heterogeneous container pattern - implementation
public class Favorites {
	private Map<Class<?>, Object> favorites = new HashMap<>();

	public <T> void putfavorite(Class<T> type, T instance) {
		// Achieving runtime type safety with a dynamic cast
		// favorites.put(Objects.requireNonNull(type), type.cast(instance));
		favorites.put(Objects.requireNonNull(type), instance);
	}

	public <T> T getFavorite(Class<T> type) {
		return type.cast(favorites.get(type));
	}
}
