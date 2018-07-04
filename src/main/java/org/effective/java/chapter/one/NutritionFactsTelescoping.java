package org.effective.java.chapter.one;

// Telescoping constructor pattern - does not scale well.
public class NutritionFactsTelescoping {
	private final int servingSize; // required
	private final int servings; // required.
	private final int calories; // optional.
	private final int fat; // optional.
	private final int sodium; // optional.
	private final int carbohydrate; // optional.

	public NutritionFactsTelescoping(int servingSize, int servings) {
		this(servingSize, servingSize, 0);
	}

	public NutritionFactsTelescoping(int servingSize, int servings, int calories) {
		this(servingSize, servings, calories, 0);
	}

	public NutritionFactsTelescoping(int servingSize, int servings, int calories, int fat) {
		this(servingSize, servings, calories, fat, 0);
	}

	public NutritionFactsTelescoping(int servingSize, int servings, int calories, int fat, int sodium) {
		this(servingSize, servings, calories, fat, sodium, 0);
	}

	public NutritionFactsTelescoping(int servingSize, int servings, int calories, int fat, int sodium,
			int carbohydrate) {
		super();
		this.servingSize = servingSize;
		this.servings = servings;
		this.calories = calories;
		this.fat = fat;
		this.sodium = sodium;
		this.carbohydrate = carbohydrate;
	}

}
