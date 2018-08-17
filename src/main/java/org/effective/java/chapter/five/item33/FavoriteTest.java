package org.effective.java.chapter.five.item33;

public class FavoriteTest {
	// Typesafe heterogeneous container pattern - client
	public static void main(String[] args) {
		Favorites f = new Favorites();
		f.putfavorite(String.class, "Java");
		f.putfavorite(Integer.class, 0xcafebabe);
		f.putfavorite(Class.class, Favorites.class);
		// f.putfavorite(List.of("a", "b"), List.class);

		String favoriteString = f.getFavorite(String.class);
		int favoriteInteger = f.getFavorite(Integer.class);
		Class<?> favoriteClass = f.getFavorite(Class.class);

		System.out.printf("%s %x %s%n", favoriteString, favoriteInteger, favoriteClass.getName());
	}
}
